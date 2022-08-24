package com.responsibilityvchain;

/**
 * @Author rc
 * @Date 2022/8/24 22:11
 * @Version 1.0
 */

public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(0, 1000f, 1);
        DepartmentApprove approve = new DepartmentApprove("r");

        CollegeApprove collegeApprove = new CollegeApprove("c");

        ViceShcoolMasterApprove masterApprove = new ViceShcoolMasterApprove("b");

        approve.setAPPROVE(collegeApprove);
        collegeApprove.setAPPROVE(masterApprove);
        masterApprove.setAPPROVE(approve);

    }
}
