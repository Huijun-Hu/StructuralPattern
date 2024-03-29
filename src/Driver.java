package src;

import src.Decorator.*;
import src.IceCream.*;

public class Driver {
    public static void main(String[] args) {

        Order Alice = new Order(new LoyaltyStatus("Alice", true));
        Alice.add(new ChocolateSauceDecorator(new JellyDecorator(new ChocolateIceCream())));
        Alice.add(new StrawberrySauceDecorator(new StrawberryIceCream()));
        System.out.println("-----Order 1-----");
        System.out.println(Alice.totalCost());

        Order Bob = new Order(new LoyaltyStatus("Bob", false));
        Bob.add(new MarshmallowDecorator(new PineappleIceCream()));
        Bob.add(new ChocolateSauceDecorator(new JellyDecorator(new StrawberrySauceDecorator(new VanillaIceCream()))));
        System.out.println("\n\n-----Order 2-----");
        System.out.println(Bob.totalCost());
    }
}
