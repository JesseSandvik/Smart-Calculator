package com.smart.calculator;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashmap = new HashMap<>();
        int firstPointer = 0;

        while (firstPointer < args.length) {
            hashmap.put(firstPointer, args[firstPointer]);
            firstPointer++;
        }
        performMathEquation();
        System.out.println(hashmap);
    }
    static void performMathEquation() {
        String[] availableIntegerStrings = {
                "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"
        };
        MathEquation mathEquation = new MathEquation(5.00d, '+', 15.00d);
        mathEquation.execute();
    }
    static double convertIntegerStringToDouble(String integerString) {
        String[] availableIntegerStrings = {
                "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"
        };
        double[] doublesForAvailableIntegerStrings = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double currentDoubleForIntegerString = 0.00d;

        for (int i = 0; i < doublesForAvailableIntegerStrings.length; i++) {
            if (integerString.toLowerCase().equals(availableIntegerStrings[i])) {
                currentDoubleForIntegerString = doublesForAvailableIntegerStrings[i];
                break;
            } else if (Double.parseDouble(integerString) == doublesForAvailableIntegerStrings[i]) {
                currentDoubleForIntegerString = doublesForAvailableIntegerStrings[i];
                break;
            }
        }
        return currentDoubleForIntegerString;
    }
    static char getSymbolForOpCode(char opCode) {
        final char[] supportedOpCodes = {'a', 's', 'm', 'd'};
        final char[] opCodeSymbols = {'+', '-', '*', '/'};
        char symbolForCurrentOpCode = opCode;

        for (int i = 0; i < supportedOpCodes.length; i++) {
            if (opCode == supportedOpCodes[i]) {
                symbolForCurrentOpCode = opCodeSymbols[i];
                break;
            }
        }
        return symbolForCurrentOpCode;
    }
}