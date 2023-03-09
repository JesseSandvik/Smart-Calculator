package com.smart.calculator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                hashmap.put(args[i], i);
            }
        } else {
            System.out.println("Please enter an equation to be performed.");
        }

        verifyAdditionOperation((HashMap) hashmap);
    }

    static void verifyAdditionOperation(HashMap hashmap) {
        String[] additionStrings = {"add", "plus", "sum"};

        for (int i = 0; i < additionStrings.length; i++) {
            if (hashmap.containsKey(additionStrings[i])) {
                System.out.println("Addition operation expected.");
                break;
            }
        }
    }

    static double handleAddition(double firstVal, double secondVal) {
        return firstVal + secondVal;
    }
}