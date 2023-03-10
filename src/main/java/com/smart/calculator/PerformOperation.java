package com.smart.calculator;

public class PerformOperation {
    double firstValue;
    double secondValue;
    char opCode;
    double result;

    PerformOperation(double firstValue, double secondValue, char opCode) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.opCode = opCode;
    }

    void execute() {
        switch (opCode) {
            case 'a':
                result = firstValue + secondValue;
                break;
            case 's':
                result = firstValue - secondValue;
                break;
            case 'm':
                result = firstValue * secondValue;
                break;
            case 'd':
                result = secondValue != 0 ? firstValue / secondValue: 0.00d;
                break;
            default:
                System.out.println("Unexpected opCode: " + opCode);
                result = 0.00d;
                break;
        }
        System.out.println(firstValue + " " + opCode + " " + secondValue + " = " + result);
    }
}
