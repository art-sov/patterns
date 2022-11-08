package chapter03.statbuzz;

import chapter03.statbuzz.impl.Espresso;
import chapter03.statbuzz.impl.HouseBlend;
import chapter03.statbuzz.impl.Mocha;
import chapter03.statbuzz.impl.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
