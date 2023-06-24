package oop_les_1.lesson_5;

public class CalcModel {
    private double result;

    public void add(double number) {
        result += number;
    }

    public void subtract(double number) {
        result -= number;
    }

    public void divide(double number) {
        CalcView localNumber = new CalcView();
        while (number == 0) {
            System.out.println("Вы не можете делить на 0, пожалуйста введите другое число");
            number = localNumber.getInputNumber2();
        }
        result /= number;
    }

    public void multiply(double number) {
        result *= number;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    class ExpandedCalcModel extends CalcModel {
        /*
         * мы, без изменения основного класса расширили его функционал
         * (Принцип открытости/закрытости (Open Closed Principle))
         * 
         * так же этот дочерний класс расширяет базовый и он может оиспользоватся вместо
         * базового ,  так же
         * Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
         */

        public void power(double number) {
            setResult(Math.pow(getResult(), number));
        }

        public void sqrt() {
            setResult(Math.sqrt(getResult()));
        }

    }
}
