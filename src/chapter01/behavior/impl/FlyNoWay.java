package chapter01.behavior.impl;

import chapter01.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can’t fly");
    }
}
