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

    class ExpandedCalcView extends CalcView {
        /*
         * мы, без изменения основного класса расширили его функционал
         * (Принцип открытости/закрытости (Open Closed Principle))
         * 
         * GetInt отдельный метод, чтобы метод getInputNumber1 не проверял отдельно
         * оператор
         * Принцип единственной ответственности (Single Responsibility Principle)
         * 
         * так же этот дочерний класс расширяет базовый и он может использоватся вместо
         * базового ,
         * Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
         */
        Scanner scan = new Scanner(System.in);

        public String getInputOperator_1() {
            System.out.print("введите оператор (+, -, *, /, pow, sqrt): ");
            String c = scan.nextLine();
            switch (c) {
                case "+":
                    return c;
                case "*":
                    return c;
                case "/":
                    return c;
                case "-":
                    return c;
                case "sqrt":
                    return c;
                case "pow":
                    return c;
                default:
                    System.out.println("Вы ввели недопустимый оператор! Попробуйте ещё раз");
                    return getInputOperator_1();
            }
        }

        public Integer getInt() {
            System.out.print("Введите первое число: ");
            try {
                String s = scan.nextLine();
                int n = Integer.parseInt(s);
                System.out.println(n);
                return n;
            } catch (Exception err) {
                except();
                return getInt();
            }
        }

    }
}
