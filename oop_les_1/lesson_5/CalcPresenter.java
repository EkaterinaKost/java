package oop_les_1.lesson_5;

import oop_les_1.lesson_5.CalcModel.ExpandedCalcModel;
import oop_les_1.lesson_5.CalcView.ExpandedCalcView;

public class CalcPresenter {
    private CalcView view;
    private CalcModel model;

    public CalcPresenter(CalcView view, CalcModel model) {
        this.view = view;
        this.model = model;
    }

    public void performCalculation() {
        double number = view.getInputNumber1();
        char operator = view.getInputOperator();
        view.scan.nextLine();
        double number_2 = view.getInputNumber2();
        model.setResult(number);

        switch (operator) {
            case '+':
                model.add(number_2);
                break;
            case '-':
                model.subtract(number_2);
                break;
            case '*':
                model.multiply(number_2);
                break;
            case '/':
                model.divide(number_2);
                break;

        }

        view.displayResult(model.getResult());

    }

    class ExpandedCalcPresenter extends CalcPresenter {
        /*
         * мы, без изменения основного класса расширили его функционал
         * (Принцип открытости/закрытости (Open Closed Principle))
         * 
         * так же этот дочерний класс расширяет базовый ,
         * Принцип подстановки Барбары Лисков (Liskov’s Substitution Principle)
         */
        private ExpandedCalcView view_1;
        private ExpandedCalcModel model_1;

        
        public ExpandedCalcPresenter (ExpandedCalcView view, ExpandedCalcModel model) {
            this.view_1 = view;
            this.model_1 = model;
        }

        @Override
        public void performCalculation() {
            double number = view_1.getInputNumber1();
            String operator = view_1.getInputOperator_1();
            view_1.scan.nextLine();

            model_1.setResult(number);
            double number_2 = 0;
            switch (operator) {
                case "+":
                    number_2 = view_1.getInputNumber2();
                    model_1.add(number_2);
                    break;
                case "-":
                    number_2 = view_1.getInputNumber2();
                    model_1.subtract(number_2);
                    break;
                case "*":
                    number_2 = view_1.getInputNumber2();
                    model_1.multiply(number_2);
                    break;
                case "/":
                    number_2 = view_1.getInputNumber2();
                    model_1.divide(number_2);
                    break;
                case "sqrt":

                    model_1.sqrt();
                    break;
                case "pow":
                    number_2 = view_1.getInt();
                    model_1.power(number_2);

            }

            view_1.displayResult(model_1.getResult());

        }
    }
}
