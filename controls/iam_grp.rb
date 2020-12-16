describe aws_iam_group("${GroupName}") do
  it { should exist }
end

describe aws_iam_policy("${ManagedPolicy}") do
  it { should be_attached }
end
