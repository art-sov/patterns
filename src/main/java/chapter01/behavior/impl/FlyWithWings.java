package chapter01.behavior.impl;

import chapter01.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I’m flying!!");
    }
}
