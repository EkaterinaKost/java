package oop_les_1.lesson_5;

import java.util.Scanner;

public class CalcView {
    Scanner scan = new Scanner(System.in);

    public double getInputNumber1() {

        System.out.print("Введите первое число: ");


        try {
            String s = scan.nextLine();
            double n = Double.parseDouble(s);
            System.out.println(n);
            return n;
        } catch (Exception err) {

            except();
            return getInputNumber1();
        }
    }

    void except() {
        System.out.println("Введено не число\nвведите число");

    }
    
    public char getInputOperator() {
        System.out.print("введите оператор (+, -, *, /): ");
        char c = scan.next().charAt(0);
        switch (c) {
            case '+':
                return c;
            case '*':
                return c;
            case '/':
                return c;
            case '-':
                return c;
            default:
                System.out.println("Вы ввели недопустимый оператор! Попробуйте ещё раз");
                return getInputOperator();
        }
    }

    public double getInputNumber2() {

        System.out.print("Введите второе число:");

        try {
            String s = scan.nextLine();
            double n = Double.parseDouble(s);
            return n;
        } catch (Exception err) {
            except();
            return getInputNumber2();
        }
    }
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }


}
