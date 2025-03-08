package com.nursalim.lambda.app;

import java.util.List;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> names = List.of("Nursalim", "Milasrun", "Al Losari");

        // using lambda
        names.forEach(name -> System.out.println(name));

        // using method reference
        names.forEach(System.out::println);
    }
}
