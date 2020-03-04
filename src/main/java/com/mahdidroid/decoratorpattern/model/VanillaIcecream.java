package com.mahdidroid.decoratorpattern.model;

import com.mahdidroid.decoratorpattern.services.IceCreamDecorator;
import com.mahdidroid.decoratorpattern.services.Icecream;

public class VanillaIcecream extends IceCreamDecorator {

    public VanillaIcecream(Icecream icecream) {
        super(icecream);
    }

    @Override
    public double cost() {
        System.out.println("adding vinilla Ice cream ");

        return 2.0 + super.cost();
    }
}
