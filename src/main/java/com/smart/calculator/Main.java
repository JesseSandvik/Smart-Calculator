package com.smart.calculator;

public class Main {
    public static void main(String[] args) {
        MathEquation mathEquation = new MathEquation();
        mathEquation.setFirstValue(Double.parseDouble(args[0]));
        mathEquation.setOpCode(args[1].toCharArray()[0]);
        mathEquation.setSecondValue(Double.parseDouble(args[2]));
    }

    static char getSymbolForOpCode(char opCode) {
        final char[] supportedOpCodes = {'a', 's', 'm', 'd'};
        final char[] opCodeSymbols = {'+', '-', '*', '/'};
        char symbolForCurrentOpCode = ' ';

        for (int i = 0; i < supportedOpCodes.length; i++) {
            if (opCode == supportedOpCodes[i]) {
                symbolForCurrentOpCode = opCodeSymbols[i];
                break;
            }
        }
        return symbolForCurrentOpCode;
    }
}