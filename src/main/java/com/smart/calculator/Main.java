package com.smart.calculator;

public class Main {
    public static void main(String[] args) {
        performMathEquation(args);
    }
    static void performMathEquation(String[] mathEquationParts) {
        MathEquation mathEquation = new MathEquation();
        mathEquation.setFirstValue(convertIntegerStringToDouble(mathEquationParts[0]));
        mathEquation.setOpCode(getSymbolForOpCode(mathEquationParts[1].toCharArray()[0]));
        mathEquation.setSecondValue(convertIntegerStringToDouble(mathEquationParts[2]));
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
            if (integerString.toLowerCase() == availableIntegerStrings[i]) {
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