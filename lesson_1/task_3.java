/*    Реализовать простой калькулятор

Введите первое число: 12
Введите операцию: +
Введите второе число: 1
Ответ: 13 */
package lesson_1;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("int a:");
        int a = iScanner.nextInt();
        System.out.println("mathematical operation: ");
        String z = iScanner.next();
        System.out.println("int b:");
        int b = iScanner.nextInt();
        // System.out.printf("%d %s %d", a, z, b);
        switch (z) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":                                     
                System.out.println(a/b);// Double c=a/b; не хочет преобразовывать целые числа в вещественные. Почему?
                break;
            case "*":
                System.out.println(a * b);
                break;
        }
        iScanner.close();
    }
    
}
