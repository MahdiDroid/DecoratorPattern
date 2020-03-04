package com.mahdidroid.decoratorpattern.model;

import com.mahdidroid.decoratorpattern.services.IceCreamDecorator;
import com.mahdidroid.decoratorpattern.services.Icecream;

public class MintIcecream extends IceCreamDecorator {
    public MintIcecream(Icecream icecream) {
        super(icecream);
    }

    @Override
    public double cost() {
        System.out.println("adding min Ice cream ");
        return 1.5+  super.cost();
    }
}
