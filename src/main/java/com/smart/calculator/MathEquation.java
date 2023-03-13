package com.smart.calculator;

public class MathEquation {
    private double firstValue;
    private double secondValue;
    private char opCode;

    public MathEquation(double firstValue, char opCode, double secondValue) {
        this.firstValue = firstValue;
        this.opCode = opCode;
        this.secondValue = secondValue;
    }

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
            case '+' -> result = this.firstValue + this.secondValue;
            case '-' -> result = this.firstValue - this.secondValue;
            case '*' -> result = this.firstValue * this.secondValue;
            case '/' -> result = this.secondValue != 0 ? this.firstValue / this.secondValue : 0.00d;
            default -> {
                System.out.println("Unexpected opCode: " + this.opCode);
                result = 0.00d;
            }
        }
        System.out.println(this.firstValue + " " + this.opCode + " " + this.secondValue + " = " + result);
    }
}
