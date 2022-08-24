package com.responsibilityvchain;

/**
 * @Author rc
 * @Date 2022/8/24 21:58
 * @Version 1.0
 */

public abstract class Approve {
    Approve APPROVE;
    String name;

    public Approve(String name) {
        this.name = name;
    }

    public void setAPPROVE(Approve APPROVE) {
        this.APPROVE = APPROVE;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
