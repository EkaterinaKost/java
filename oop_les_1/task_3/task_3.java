package oop_les_1.task_3;

/*Задача 3 - по желанию, для тех кто уже проходил ООП, чтобы было не скучно.:
Реализуйте систему управления библиотекой. Создайте классы "Книга" (Book) 
и "Библиотека" (Library) со следующими свойствами и методами:

Класс "Книга" (Book):

Приватные поля "название" (title) и "автор" (author) типа String для 
хранения названия и автора книги соответственно.
Приватное поле "доступность" (available) типа boolean для указания 
доступности книги.
Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
Публичный метод "показать информацию" (displayInfo), который выводит 
на консоль информацию о книге (название, автор, доступность).
Класс "Библиотека" (Library):

Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения
 списка книг в библиотеке.
Публичный метод "добавить книгу" (addBook), который принимает объект
 типа Book и добавляет его в каталог библиотеки.
Публичный метод "удалить книгу" (removeBook), который принимает объект
 типа Book и удаляет его из каталога библиотеки.
Публичный метод "показать доступные книги" (displayAvailableBooks), 
который выводит на консоль информацию о доступных книгах в библиотеке.
Публичный метод "поиск книги по автору" (searchByAuthor), который
 принимает имя автора в качестве параметра и выводит на консоль информацию 
 о книгах данного автора, находящихся в каталоге библиотеки. */
public class task_3 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Пикник на обочине", "Стругацкие"));
        library.addBook(new Book("Трудно быть Богом", "Стругацкие"));
        library.addBook(new Book("Улитка на склоне", "Стругацкие"));
        library.addBook(new Book("Мастер и Маргарита", "Булгаков"));
        library.addBook(new Book("Собачье сердце", "Булгаков"));
        library.addBook(new Book("Морфий", "Булгаков"));
        library.addBook(new Book("Три товарища", "Ремарк"));
        library.addBook(new Book("Триумфальная арка", "Ремарк"));
        library.addBook(new Book("Сборник стихов", "Есенин"));
        // library.displayAvailableBooks();
        library.removeBook(new Book("Морфий", "Булгаков"));
        // library.displayAvailableBooks();
        library.searchByAuthor("Стругацкие");

        library.displayAvailableBooks("Булгаков");

    }
}
