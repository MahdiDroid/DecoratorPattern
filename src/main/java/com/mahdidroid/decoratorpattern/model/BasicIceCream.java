package com.mahdidroid.decoratorpattern.model;

import com.mahdidroid.decoratorpattern.services.Icecream;

public class BasicIceCream implements Icecream {

    public BasicIceCream() {
        System.out.println("creating basic IceCream ");
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
