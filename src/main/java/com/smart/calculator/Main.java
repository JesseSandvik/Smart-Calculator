package com.smart.calculator;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                hashtable.put(i, args[i]);
            }
        } else {
            System.out.println("Please enter an equation to be performed.");
        }

        System.out.println(hashtable);
    }

    static double handleAddition(double firstVal, double secondVal) {
        return firstVal + secondVal;
    }
}