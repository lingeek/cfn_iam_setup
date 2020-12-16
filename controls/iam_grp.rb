describe aws_iam_group('grp-test') do
  it { should exist }
end

describe aws_iam_policy('ViewOnlyAccess') do
  it { should be_attached }
end
