package com.nursalim.lambda.app;

import com.nursalim.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

//        Predicate<String> predicate = value -> StringUtil.isLowerCase(value);
        // with method reference
        Predicate<String> predicate = StringUtil::isLowerCase;
        System.out.println(predicate.test("Nursalim"));
        System.out.println(predicate.test("nursalim"));

        // Method reference in parameter
//        Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("Nursalim"));
    }

    // access method reference non static
    public void run() {
        Predicate<String> predicate = this::isUpperCase;
        System.out.println(predicate.test("NURSALIM"));
        System.out.println(predicate.test("Nursalim"));
    }

    // access method reference object
    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicate = app::isUpperCase;
        System.out.println(predicate.test("NURSALIM"));
        System.out.println(predicate.test("Nursalim"));
    }

    public boolean isUpperCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isUpperCase(c)) {
                return false;
            }
        }
        return true;
    };
}
