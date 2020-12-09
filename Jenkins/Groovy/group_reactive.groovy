def command = "aws iam list-groups --output text --query 'Groups[*].[GroupName]' --profile ${Environment}"
def proc =command.execute()
proc.waitFor()

def output = proc.in.text
def exitcode= proc.exitValue()
def error = proc.err.text

if (error) {
    println "Std Err: ${error}"
    println "Process exit code: ${exitcode}"
    return exitcode
}
return output.tokenize()