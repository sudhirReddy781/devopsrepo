package com.solveit;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int numberOperations(int num1, int num2, String operator) {
        //int i = 1/0;
        if ("+".equals(operator)) {
            System.out.println("Add:" + (num1 + num2));
            return (num1 + num2);
        } else if ("-".equals(operator)) {
            System.out.println("Subtract:" + (num1 - num2));
            return (num1 - num2);
        } else {
            System.out.println("Invalid operator");
            throw new RuntimeException("Invalid operator");
        }
    }
}
