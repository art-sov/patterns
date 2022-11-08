package chapter03.statbuzz.impl;

import chapter03.statbuzz.Beverage;
import chapter03.statbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
