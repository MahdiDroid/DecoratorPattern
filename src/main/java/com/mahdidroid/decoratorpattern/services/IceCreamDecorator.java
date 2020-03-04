package com.mahdidroid.decoratorpattern.services;

public class IceCreamDecorator implements Icecream {

    private Icecream iceCream;

    public IceCreamDecorator(Icecream icecream) {
        this.iceCream = icecream;
    }



    @Override
    public double cost() {
        return this.iceCream.cost();
    }
}
