package com.decorator;

/**
 * @author 86176
 */
public abstract class Drink {

    public String des;
    private float price=0.0f;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 子类进行费用计算
     * @return
     */
    public abstract float cost();
}
