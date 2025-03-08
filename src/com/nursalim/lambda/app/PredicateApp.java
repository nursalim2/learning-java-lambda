package com.nursalim.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = value -> value.isBlank();

        System.out.println(predicate.test("Nursalim"));
        System.out.println(predicate.test(""));
        System.out.println(predicate.test(" "));
    }
}
