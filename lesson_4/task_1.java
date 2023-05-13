//1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), 
//который вернет “перевернутый” список.
package lesson_4;

import java.util.LinkedList;
import java.util.Random;

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        int n=10;
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(0, 100));
        }
        System.out.println("исходный список "+list);
    
        LinkedList<Integer> reversedList = reversList(list);
        System.out.println("перевернутый список "+reversedList);
    }
    public static LinkedList<Integer> reversList (LinkedList<Integer> list) {
        LinkedList<Integer> reversedList= new LinkedList<>();
        for (int i = list.size()-1; i >=0; i--) {
            Integer el=list.get(i);
            reversedList.add(el);
        }
        return reversedList;
        
    }
   
}

