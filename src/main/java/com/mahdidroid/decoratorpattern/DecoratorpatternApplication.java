package com.mahdidroid.decoratorpattern;

import com.mahdidroid.decoratorpattern.model.BasicIceCream;
import com.mahdidroid.decoratorpattern.model.MintIcecream;
import com.mahdidroid.decoratorpattern.model.VanillaIcecream;
import com.mahdidroid.decoratorpattern.services.Icecream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorpatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecoratorpatternApplication.class, args);

        Icecream basicIcecream = new BasicIceCream();
        System.out.println("Basic ICe cream cost : " + basicIcecream.cost());

        //add vanilla to order

        Icecream vanilla = new VanillaIcecream(basicIcecream );
        System.out.println("vannila cost : " + vanilla.cost());

        Icecream mint = new MintIcecream(vanilla);
        System.out.println("mint icecream : " + mint.cost());
    }

}
