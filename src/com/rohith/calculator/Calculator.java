package com.rohith.calculator;

public class Calculator {

    private String owner;

    private int taxamt = 0;

    public Calculator() {
    }

    public Calculator(String owner) {
        this.owner = owner;
    }

    public Calculator(int tax) {
        taxamt = tax;
    }

    public int multiply(int e, int f) {
        return (e * f) + taxamt;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int c, int d) {
        return c - d;
    }

    public String getOwner() {
        return owner;
    }
}
