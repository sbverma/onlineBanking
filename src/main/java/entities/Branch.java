package entities;

import pojo.BranchAddress;

public class Branch {

    private Long branchId;
    private String ifscCode;
    private String branchName;
    private BranchAddress address;
    private Long headBranchId;

    public Branch() {
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public BranchAddress getAddress() {
        return address;
    }

    public void setAddress(BranchAddress address) {
        this.address = address;
    }

    public Long getHeadBranchId() {
        return headBranchId;
    }

    public void setHeadBranchId(Long headBranchId) {
        this.headBranchId = headBranchId;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", ifscCode='" + ifscCode + '\'' +
                ", branchName='" + branchName + '\'' +
                ", address=" + address +
                ", headBranchId=" + headBranchId +
                '}';
    }
}
