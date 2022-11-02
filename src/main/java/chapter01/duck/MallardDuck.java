package chapter01.duck;

import chapter01.Duck;
import chapter01.behavior.impl.FlyWithWings;
import chapter01.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
