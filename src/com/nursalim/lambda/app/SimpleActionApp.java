package com.nursalim.lambda.app;

import com.nursalim.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        // With anonymous class
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return "Hello " + name;
            }
        };

        System.out.println(simpleAction1.action("Nursalim"));

        // With lambda
        SimpleAction simpleAction2 = (name) -> {
          return "Hello " + name;
        };

        System.out.println(simpleAction2.action("Nursalim"));

        SimpleAction simpleAction3 = (name) -> "Hello " + name;
        System.out.println(simpleAction3.action("Nursalim"));

        SimpleAction simpleAction4 = name -> "Hello " + name;
        System.out.println(simpleAction4.action("Nursalim"));
    }
}
