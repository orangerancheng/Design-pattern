package com.responsibilityvchain;

/**
 * @Author rc
 * @Date 2022/8/24 22:03
 * @Version 1.0
 */

public class DepartmentApprove extends Approve {
    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 5000) {
            System.out.println(this.getClass() + "  " + this.name);
        } else {
            APPROVE.processRequest(purchaseRequest);
        }
    }
}
