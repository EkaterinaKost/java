/*Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.

Пример:
[1, 2, 3, 4, 5, 6, 7]
spisok.enqueue(8)
[1, 2, 3, 4, 5, 6, 7,8]
spisok.dequeue
1
[2, 3, 4, 5, 6, 7,8]
spisok.first()
2
[2, 3, 4, 5, 6, 7,8] */

package lesson_4;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        int n = 10;
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            list.add(rnd.nextInt(0, 100));
        }
        System.out.println("исходный список " + list);
        enqueue(list);// добавили элемент в конец
        System.out.println(list);
        System.out.println(dequeue(list)); // удалили первый элемент
        System.out.println(list);
        System.out.println(first(list)); // вывели первый элемент
        System.out.println(list);
    }

    public static void enqueue(LinkedList<Integer> list) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введите число ");
        int a = iScanner.nextInt();
        list.addLast(a);
        iScanner.close();
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> ll) {
        int num = ll.get(0);
        return num;
    }
   
}
