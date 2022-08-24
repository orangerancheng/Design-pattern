package com.responsibilityvchain;

/**
 * @Author rc
 * @Date 2022/8/24 22:09
 * @Version 1.0
 */

public class ViceShcoolMasterApprove extends Approve {
    public ViceShcoolMasterApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getPrice() <= 15000) {
            System.out.println(this.getClass() + "  " + this.name);
        } else {
            APPROVE.processRequest(purchaseRequest);
        }
    }
}
