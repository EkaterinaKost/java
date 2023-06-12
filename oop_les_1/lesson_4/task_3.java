package oop_les_1.lesson_4;

public class task_3 {
    public static void main(String[] args) {
        System.out.println(getMax(3, 5));
        System.out.println(getMax(42.2, 42.3));
        System.out.println(getMax("bba", "bb"));
        
    }
    public static <T extends Comparable<T>>T getMax(T a, T b){
        return a.compareTo(b) >= 0 ? a : b;
    }
}
