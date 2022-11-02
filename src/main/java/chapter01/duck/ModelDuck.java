package chapter01.duck;

import chapter01.Duck;
import chapter01.behavior.impl.FlyNoWay;
import chapter01.behavior.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
