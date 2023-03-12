package com.smart.calculator;

public class MathEquation {
    private double firstValue;
    private double secondValue;
    private char opCode;

    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }

    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    void execute() {
        double result;

        switch (opCode) {
            case '+':
                result = this.firstValue + this.secondValue;
                break;
            case '-':
                result = this.firstValue - this.secondValue;
                break;
            case '*':
                result = this.firstValue * this.secondValue;
                break;
            case '/':
                result = this.secondValue != 0 ? this.firstValue / this.secondValue: 0.00d;
                break;
            default:
                System.out.println("Unexpected opCode: " + this.opCode);
                result = 0.00d;
                break;
        }
        System.out.println(this.firstValue + " " + this.opCode + " " + this.secondValue + " = " + result);
    }
}
