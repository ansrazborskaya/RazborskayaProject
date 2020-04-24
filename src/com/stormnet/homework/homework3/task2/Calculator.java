package com.stormnet.homework.homework3.task2;


import java.util.Scanner;

public class Calculator {

    private double a;
    private double b;


    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    Calculator() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    private void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input A: ");
        setA(scanner.nextDouble());
        System.out.println("Input B: ");
        setB(scanner.nextDouble());
    }

    void addUpTheNumbers() {

        System.out.println("ADDITION");
        this.input();
        double result = a + b;
        System.out.println("Addition result: " + result);

    }

    void divideTheNumbers() {

        System.out.println("DIVISION");
        this.input();
        double result = a / b;
        System.out.println("Division result: " + result);

    }

    void multiplyNumbers(double a, double b) {

        double result = getA() * getB();
        System.out.println("Multiply result: " + result);

    }

    void squareRootNumber(double a) {
        double result = Math.sqrt(getA());
        System.out.println("Square root result " + result);
    }

    void exponentiation() {

        System.out.println("exponentiation");
        this.input();
        double result = Math.pow(a, b);
        System.out.println("exponentiation result: " + result);

    }
}
