package com.nursalim.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Nursalim";
        String name = supplier.get();
        System.out.println(name);
    }
}
