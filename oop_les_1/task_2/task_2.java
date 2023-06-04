package oop_les_1.task_2;

public class task_2 implements I_Const {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(-2);
        Rectangle rec3 = new Rectangle(3, 8);
        if (rec2.getWidth() < MIN)
            System.out.println(ERROR);
        rec1.calculateArea();
        rec1.calculatePerimeter();
        rec2.calculateArea();
        rec2.calculatePerimeter();
        rec3.calculateArea();
        rec3.calculatePerimeter();

        Rectangle.calculateArea(10, 5);
        Rectangle.calculatePerimeter(10, 5);

        System.out.println("------------");

        MyClass c1 = new MyClass();

        c1.num_1();
        c1.num_2();
        c1.num_3();

        System.out.println("------------");

        My_Cl mc1 = new My_Cl();
        
        System.out.println("ID пользователя: " + mc1.getUserID());
        System.out.println("ID админа: " + mc1.getAdminID());

    }
}
