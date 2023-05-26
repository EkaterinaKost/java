/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
 что 1 человек может иметь несколько телефонов.
Добавить функции 1) Добавление номера
2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568 */
package lesson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> bookPhone = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int com = input_number(sc);
            sc.nextLine();
            if (com == 1) {
                add(bookPhone, sc);
            }
            if (com == 2) {
                printall(bookPhone);
            }
            if (com == 3) {
                break;
            }
        }
        sc.close();
    }

    public static Integer input_number(Scanner scanner) {
        System.out.println("Введите 1, чтобы добавить номер; 2, чтобы вывести все записи; 3-чтобы завершить");
        Integer number = 0;
        try {
            number = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели не число. Попробуйте еще раз");
            scanner.nextLine();
            input_number(scanner);
        }
        return number;
    }

    public static void add(HashMap<String, ArrayList<String>> bookPhone, Scanner sc) {
        System.out.println("Введите фамилию: ");
        String name = sc.nextLine();
        System.out.println("Введите номер: ");
        String num = sc.nextLine();
        if (!bookPhone.containsKey(name)) {
            bookPhone.put(name, new ArrayList<>());
        }
        bookPhone.get(name).add(num);
    }

    public static void printall(HashMap<String, ArrayList<String>> bookPhone) {
        bookPhone.entrySet().forEach(entry -> {
            System.out.println(
                    entry.getKey() + ":" + entry.getValue().toString().replaceAll("\\[", "").replaceAll("\\]", ""));
        });
    }
}