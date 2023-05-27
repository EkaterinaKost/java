package lesson_6;
/*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.

NoteBook notebook1 = new NoteBook
NoteBook notebook2 = new NoteBook
NoteBook notebook3 = new NoteBook
NoteBook notebook4 = new NoteBook
NoteBook notebook5 = new NoteBook

Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет

    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

    Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

Класс сделать в отдельном файле

приветствие
Выбор параметра
выбор конкретнее
вывод подходящих
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task_1 {
    public static void main(String[] args) {
        Set<Laptop> laptops = creatLaptops();
        Map<Integer, Object> filterCriteria = getCriteria();
        Set<Laptop> filteredLaptops = filterLaptops(laptops, filterCriteria);
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }

    }

    // Создание множества ноутбуков
    private static Set<Laptop> creatLaptops() {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop(4, 128, "Windows", "Black", "HP", 15.6));
        laptops.add(new Laptop(16, 1024, "Windows", "Silver", "Dell", 13.3));
        laptops.add(new Laptop(8, 256, "Linux", "White", "Acer", 14.0));
        laptops.add(new Laptop(16, 512, "Linux", "White", "HP", 14.0));
        laptops.add(new Laptop(32, 1024, "macOS", "Black", "Apple", 15.6));
        laptops.add(new Laptop(8, 512, "macOS", "Black", "Apple", 15.6));
        laptops.add(new Laptop(16, 1024, "Windows", "Silver", "Dell", 13.3));
        laptops.add(new Laptop(4, 256, "Linux", "Black", "Acer", 14.0));
        laptops.add(new Laptop(16, 512, "Windows", "White", "Dell", 13.3));
        laptops.add(new Laptop(16, 512, "macOS", "Silver", "Apple", 14.0));
        return laptops;
    }

    private static Map<Integer, Object> getCriteria() {
        try (Scanner scanner = new Scanner(System.in)) {
            Map<Integer, Object> filterCriteria = new HashMap<>();

            System.out.println("Введите цифру, соответствующую необходимому критерию:\n" +
                    "1 - ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n" +
                    "5 - Бренд\n" +
                    "6 - Размер экрана\n");

            int sc = scanner.nextInt();
            scanner.nextLine();

            Object filterValue = "";
            switch (sc) {
                case 1:
                    System.out.println("Выберите требуемый объем ОЗУ:\n" +
                            "1 - 4ГБ\n" +
                            "2 - 8ГБ\n" +
                            "3 - 16ГБ\n" +
                            "4 - 32ГБ\n");
                    int ramsc = scanner.nextInt();
                    scanner.nextLine();
                    switch (ramsc) {
                        case 1:
                            filterValue = 4;
                            break;
                        case 2:
                            filterValue = 8;
                            break;
                        case 3:
                            filterValue = 16;
                            break;
                        case 4:
                            filterValue = 32;
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Выберите требуемый объем жесткого диска:\n" +
                            "1 - 128ГБ\n" +
                            "2 - 256ГБ\n" +
                            "3 - 512ГБ\n" +
                            "4 - 1024ГБ\n");
                    int hdsc = scanner.nextInt();
                    scanner.nextLine();
                    switch (hdsc) {
                        case 1:
                            filterValue = 128;
                            break;
                        case 2:
                            filterValue = 256;
                            break;
                        case 3:
                            filterValue = 512;
                            break;
                        case 4:
                            filterValue = 1024;
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Выберите операционную систему:\n" +
                            "1 - Windows" +
                            "2 - macOS" +
                            "3 - Linux");
                    int ossc = scanner.nextInt();
                    scanner.nextLine();
                    switch (ossc) {
                        case 1:
                            filterValue = "Windows";
                            break;
                        case 2:
                            filterValue = "macOS";
                            break;
                        case 3:
                            filterValue = "Linux";
                            break;

                    }
                    break;
                case 4:
                    System.out.println("Выберите цвет:\n" +
                            "1 - Black\n" +
                            "2 - Silver\n" +
                            "3 - White\n");
                    int colorsc = scanner.nextInt();
                    scanner.nextLine();
                    switch (colorsc) {
                        case 1:
                            filterValue = "Black";
                            break;
                        case 2:
                            filterValue = "Silver";
                            break;
                        case 3:
                            filterValue = "White";
                            break;

                    }
                    break;
                case 5:
                    System.out.println("Выберите бренд:\n" +
                            "1 - HP\n" +
                            "2 - DELL\n" +
                            "3 - Acer\n" +
                            "4 - Apple\n");
                    int brandsc = scanner.nextInt();
                    scanner.nextLine();
                    switch (brandsc) {
                        case 1:
                            filterValue = "HP";
                            break;
                        case 2:
                            filterValue = "DELL";
                            break;
                        case 3:
                            filterValue = "Acer";
                            break;
                        case 4:
                            filterValue = "Apple";
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Выберите размер экрана:\n" +
                            "1 - 13,3\n" +
                            "2 - 14,0\n" +
                            "3 - 15,6\n");
                    int screensc = scanner.nextInt();
                    scanner.nextLine();
                    switch (screensc) {
                        case 1:
                            filterValue = "13,3";
                            break;
                        case 2:
                            filterValue = "14,0";
                            break;
                        case 3:
                            filterValue = "15,6";
                            break;

                    }
                    break;

                default: {
                    System.out.println("Некорректный выбор критерия. Фильтрация не будет применена.");
                    return filterCriteria;
                }
            }
            filterCriteria.put(sc, filterValue);
            return filterCriteria;
        }
    }

    private static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<Integer, Object> filterCriteria) {
        Set<Laptop> filteredLaptops = new HashSet<>();

        for (Laptop laptop : laptops) {
            boolean meetsCriteria = false;

            for (Map.Entry<Integer, Object> entry : filterCriteria.entrySet()) {
                int choice = entry.getKey();
                Object filterValue = entry.getValue();

                switch (choice) {
                    case 1:
                        int ram = laptop.getRam();
                        if (ram == (int) filterValue) {
                            meetsCriteria = true;
                        }
                        break;
                    case 2:
                        int hd = laptop.getHd();
                        if (hd == (int) filterValue) {
                            meetsCriteria = true;
                        }
                        break;
                    case 3:
                        String os = laptop.getOs();
                        if (os.equalsIgnoreCase((String) filterValue)) {
                            meetsCriteria = true;
                        }
                        break;
                    case 4:
                        String color = laptop.getColor();
                        if (color.equalsIgnoreCase((String) filterValue)) {
                            meetsCriteria = false;
                        }
                        break;
                    case 5:
                        String brand = laptop.getBrand();
                        if (brand.equalsIgnoreCase((String) filterValue)) {
                            meetsCriteria = true;
                        }
                        break;
                    case 6:
                        Double screenSize = laptop.getScreenSize();
                        if (screenSize == filterValue) {
                            meetsCriteria = true;
                        }
                        break;

                    /*
                     * "1 - ОЗУ\n" +
                     * "2 - Объем ЖД\n" +
                     * "3 - Операционная система\n" +
                     * "4 - Цвет\n" +
                     * "5 - Бренд\n" +
                     * "6 - Размер экрана\n" +
                     * 
                     */
                    default:
                        meetsCriteria = false;
                        break;
                }
                if (!meetsCriteria) {
                    break; // Если ноутбук не соответствует хотя бы одному критерию, прекращаем проверку
                }
            }
            if (meetsCriteria) {
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;
    }

}
