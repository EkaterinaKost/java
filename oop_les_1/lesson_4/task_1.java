package oop_les_1.lesson_4;

public class task_1 {
    public static void main(String[] args) {
        printElement("Hello, world");
        printElement(38);
        printElement(38.11);
        printElement(40f);
    }

    static <T> void printElement(T t) {
        System.out.println(t.toString() + ": " + t.getClass().getName());
    }
}
