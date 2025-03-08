package com.nursalim.lambda.app;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Nursalim", "Milasrun", "Al", "Losari"));
        // with lambda
        names.removeIf(value -> value.startsWith("M"));
        System.out.println(names);
    }
}
