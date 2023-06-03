package oop_les_1.task_1;

/*Создайте класс "Кот" (Cat) со следующими свойствами:

Приватное поле "имя" (name) типа String для хранения имени кота.
Приватное поле "возраст" (age) типа int для хранения возраста кота.
Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
Публичный метод "приветствие" (greet), который выводит на консоль приветствие
 вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
Дополнительное задание:
Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String.
 Добавьте соответствующее поле в классе "Кот" и методы доступа для него.
  Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие 
  вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). 
  Мой владелец - <имя владельца>.". */
public class Cat {
    private String name;
    private int age;
    private Owner master;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Owner getMaster() {
        return master;
    }
    public void setMaster(Owner master) {
        this.master = master;
    }

    public Cat(String name, int age, Owner master) {
        this(name, age);
        this.master = master;
    }

    public Cat() {
        this("Кот", 0);
    }


    public void greet() {
        System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + "года(лет). Владелец: " + master.getName());
    }

}
