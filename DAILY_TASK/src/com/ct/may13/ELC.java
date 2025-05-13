package com.ct.may13;

public class ELC {

    public static void main(String[] args) {
        CoffeeOrder c = new CoffeeOrder(CoffeeType.Coldcoffee, CoffeeSize.Medium);
        System.out.println(c.getOrderDetails());
    }
}
