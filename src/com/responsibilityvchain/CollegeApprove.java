package com.responsibilityvchain;

/**
 * @Author rc
 * @Date 2022/8/24 22:06
 * @Version 1.0
 */

public class CollegeApprove extends Approve {
    public CollegeApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 10000) {
            System.out.println(this.getClass() + "  " + this.name);
        } else {
            APPROVE.processRequest(purchaseRequest);
        }
    }
}
