/*    Пусть дан список сотрудников:
    Иван Иванов
    Светлана Петрова
    Кристина Белова
    Анна Мусина
    Анна Крутова
    Иван Юрин
    Петр Лыков
    Павел Чернов
    Петр Чернышов
    Мария Федорова
    Марина Светлова
    Мария Савина
    Мария Рыкова
    Марина Лугова
    Анна Владимирова
    Иван Мечников
    Петр Петин
    Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с
 количеством повторений.
Отсортировать по убыванию популярности Имени. */
package lesson_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class task_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> namePeople = new HashMap<>();
        ArrayList<String> staff = new ArrayList<>();
        staff.add("Иван Иванов");
        staff.add("Светлана Петрова");
        staff.add("Кристина Белова");
        staff.add("Анна Мусина");
        staff.add("Анна Крутова");
        staff.add("Иван Юрин");
        staff.add("Петр Лыков");
        staff.add("Павел Чернов");
        staff.add("Петр Чернышов");
        staff.add("Мария Федорова");
        staff.add("Марина Светлова");
        staff.add("Мария Савина");
        staff.add("Мария Рыкова");
        staff.add("Марина Лугова");
        staff.add("Анна Владимирова");
        staff.add("Иван Мечников");
        staff.add("Петр Петин");
        staff.add("Иван Ежов");
        countName(staff, namePeople);
        // System.out.println(namePeople);
        sortedStaff(namePeople);
    }

    public static void countName(ArrayList<String> people, HashMap<String, Integer> namePeople) {
        for (String person : people) {
            String name = person.split(" ")[0];
            if (namePeople.containsKey(name)) {
                namePeople.put(name, namePeople.get(name) + 1);
            } else {
                namePeople.put(name, 1);
            }
        }
        System.out.println("посчитали колличество имён");
        namePeople.entrySet().forEach(System.out::println);

    }

    public static void sortedStaff(HashMap<String, Integer> namePeople) {
        HashMap<String, Integer> sortedName = namePeople.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        HashMap.Entry::getKey,
                        HashMap.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        System.out.println("отсортированный массив");
        sortedName.entrySet().forEach(System.out::println);
    }
}
