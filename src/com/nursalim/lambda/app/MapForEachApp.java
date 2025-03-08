package com.nursalim.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> name = new HashMap<>();
        name.put("firstName", "Nursalim");
        name.put("middleName", "Milasrun");
        name.put("lastName", "Al Losari");

        name.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
