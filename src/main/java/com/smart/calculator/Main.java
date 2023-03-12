package com.smart.calculator;

public class Main {
    public static void main(String[] args) {
        MathEquation mathEquation = new MathEquation();
        mathEquation.setFirstValue(Double.parseDouble(args[0]));
        mathEquation.setOpCode(getSymbolForOpCode(args[1].toCharArray()[0]));
        mathEquation.setSecondValue(Double.parseDouble(args[2]));
        mathEquation.execute();
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