package oop_les_1.lesson_3;

import java.util.Comparator;

public class SalaryComporator implements Comparator<Worker>{
    
    @Override
    public int compare(Worker o1, Worker o2) {
        return Integer.compare(o1.salary, o2.salary);
    }
}
