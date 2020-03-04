package com.mahdidroid.decoratorpattern.model;

import com.mahdidroid.decoratorpattern.services.IceCreamDecorator;
import com.mahdidroid.decoratorpattern.services.Icecream;

public class ChocolateIcecream extends IceCreamDecorator {


    public ChocolateIcecream(Icecream icecream) {
        super(icecream);
    }

    @Override
    public double cost() {
        return 1.0 + super.cost();
    }
}
