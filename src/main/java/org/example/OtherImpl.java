package org.example;

import org.example.SomeInterface;

public class OtherImpl implements SomeInterface {
    @Override
    public void doSomething() {
        System.out.println("B");
    }
}