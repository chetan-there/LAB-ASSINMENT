package com.ct.may13;

public class CoffeeOrder {

    private CoffeeType type;
    private CoffeeSize size;

    public CoffeeOrder(CoffeeType type, CoffeeSize size) {
        this.type = type;
        this.size = size;
    }

    public String getOrderDetails() {
        return "Type :" + type.name() + " Size :" + size.name();

    }

}