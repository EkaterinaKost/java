package oop_les_1.lesson_5;

public class CalcPresenter {
    private CalcView view;
    private CalcModel model;
    public CalcPresenter(CalcView view, CalcModel model){
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
}
