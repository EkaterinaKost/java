package oop_les_1.task_2;
/*Задача 2:
Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства 
ширина (width) и высота (height). Класс должен обладать следующими методами:

Конструктор без параметров, который создает прямоугольник с шириной и высотой
 по умолчанию.
Конструктор, который принимает значения ширины и высоты и создает прямоугольник 
с заданными значениями.
Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
Метод "вычислить площадь" (calculateArea), который возвращает площадь
 прямоугольника (ширина * высота).
Метод "вычислить периметр" (calculatePerimeter), который возвращает 
периметр прямоугольника (2 * (ширина + высота)). */

public class Rectangle implements I_Oper {
    private int width;
    private int height;
   
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width) {
        this(width, width);
    }

    public Rectangle() {
        this(5, 3);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public int calculateArea() {
        int area =  width * height;
       System.out.printf("Площадь прямоугольника %dх%d: %d\n", width, height, area);
      return area;
    }
    @Override
    public void calculatePerimeter() {
        System.out.printf("Периметр прямоугольника %dх%d: %d\n", width, height, 2 * (width + height));
    }

    public static void calculateArea(int width, int height) {
        System.out.printf("Площадь прямоугольника %dх%d: %d\n", width, height, width * height);
    }

    public static void calculatePerimeter(int width, int height) {
        System.out.printf("Периметр прямоугольника %dх%d: %d\n", width, height, 2 * (width + height));
    }
}
