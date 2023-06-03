package oop_les_1.task_2;

public class task_2 {
    public static void main(String[] args) {
        Rectangle rec1= new Rectangle();
        Rectangle rec2= new Rectangle(7);
        Rectangle rec3= new Rectangle(3, 8);
        rec1.calculateArea();
        rec1.calculatePerimeter();
        rec2.calculateArea();
        rec2.calculatePerimeter();
        rec3.calculateArea();
        rec3.calculatePerimeter();

        Rectangle.calculateArea(10, 5);
        Rectangle.calculatePerimeter(10, 5);
    }
}
