package com.nursalim.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Nursalim");
        sayHello(null);
    }

    public static void sayHello(String name) {
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(value -> System.out.println("Hello " +   value),
//                        () -> System.out.println("Hello")
//                );
//

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");
        System.out.println("Hello " + upperName);

//        Optional<String> optionalName = Optional.ofNullable(name);
//        var upperName = optionalName.map(value -> value.toUpperCase());
//        upperName.ifPresent(value -> System.out.println("Hello " + value));
    }
}
