package oop_les_1.lesson_4;

public class task_2 {
    public static void main(String[] args) {
        String[] strArr = { "one", "two", "three" };
        Integer[] intArr = { 1, 2, 3 };
        printArray(strArr);
        printArray(intArr);
    }

    static <T> void printArray(T[] arr) {
        for (T el : arr) {
            System.out.println(el.toString() + ": " + el.getClass().getName());
        }
    }
}
