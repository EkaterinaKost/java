package oop_les_1.task_1;

public class task_1 {
    public static void main(String[] args) {
        Cat c1 = new Cat("Кексик", 13, new Owner("Екатерина"));
        Cat c2 = new Cat("Барсик", 5, new Owner("Ирина"));
        c1.greet();
        c2.greet();
    }
}
