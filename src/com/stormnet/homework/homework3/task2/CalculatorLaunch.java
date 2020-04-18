package com.stormnet.homework.homework3.task2;


public class CalculatorLaunch {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.exponentiation();
        calculator.addUpTheNumbers();
        calculator.divideTheNumbers();
        calculator.multiplyNumbers(5.5, 2.9);

        Calculator calculator1 = new Calculator(8, 2);
        calculator1.multiplyNumbers(calculator1.getA(), calculator1.getB());
        calculator1.squareRootNumber(calculator1.getA());

    }
}
