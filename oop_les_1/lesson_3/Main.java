package oop_les_1.lesson_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        List<Worker> lw = new ArrayList<>();
        
        lw.add(new Worker("Иван ", "Иванов " , r.nextInt(18, 46), r.nextInt(50000)));
        lw.add(new Worker("Петр ", "Петров " , r.nextInt(18, 46), r.nextInt(50000)));
        lw.add(new Worker("Алексей ", "Алексеев " , r.nextInt(18, 46), r.nextInt(50000)));
        lw.add(new Worker("Николай ", "Николаев " , r.nextInt(18, 46), r.nextInt(50000)));
        lw.add(new Worker("Степан ", "Степанв " , r.nextInt(18, 46), r.nextInt(50000)));
        System.out.println("исходный список");
       
        System.out.println(lw);

        lw.sort(new AgeComporator());
        System.out.println("\nсписок отсортирован по возрасту");

        System.out.println(lw);
        
         
        lw.sort(new SalaryComporator());
        System.out.println("\nсписок отсортирован по зарплате");
        
        System.out.println(lw);
       
    }
}

