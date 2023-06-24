package oop_les_1.lesson_5;

import oop_les_1.lesson_5.CalcModel.ExpandedCalcModel;
import oop_les_1.lesson_5.CalcPresenter.ExpandedCalcPresenter;
import oop_les_1.lesson_5.CalcView.ExpandedCalcView;

/*
* Весь этот проект это пример
* Принципа единственной ответственности (Single Responsibility Principle)
* т.к. калькулятор можно написать и в один класс, но мы разделяем его на View для общения с пользователем и
* модель, чтобы написать основные функции
*  presenter, чтобы управлять калькулятором  */
public class Main {
    public static void main(String[] args) {
        ExpandedCalcView view = new ExpandedCalcView();
        ExpandedCalcModel model = new ExpandedCalcModel();
        ExpandedCalcPresenter presenter = new ExpandedCalcPresenter(view, model);
        presenter.performCalculation();
    }
}
