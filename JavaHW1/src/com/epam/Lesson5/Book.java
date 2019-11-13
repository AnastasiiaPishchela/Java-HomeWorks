package com.epam.Lesson5;

/*
Задача 1: Напишите программу на языке Java, в которой:
 − опишите хорошо инкапсулированный класс Book
 (ID, Название, Автор, Издательство, Год издания, Количество страниц, Стоимость),
 т.е. закрытые поля с методами доступа.
 Добавьте в класс конструктор со всеми параметрами.
 Добавьте в класс метод view() для отображения (вывода) объекта.
 − опишите класс Books, который будет содержать массив объектов (поле) типа Book;
 конструктор, принимающий размер массива и выделяющий память под него;
 метод добавления одной книги;
 метод отображения всех книг в массиве;
 метод изменения стоимости книг на указанное количество процентов;
 метод поиска всех книг указанного автора;
 метод поиска всех книг, изданных после указанного года.
 − опишите класс с методом main(), в котором ввести размерность массива книг и создать объект типа Books;
 создать и добавить объекты типа Book в объект типа Books;
 отобразить в консоль набор книг;
 использовать все остальные методы класса Books.
 */

public class Book {
    private int id;
    private String bookName;
    private String authorName;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;

    public Book(int id, String bookName, String authorName,
                String publisher, int yearOfPublication,
                int numberOfPages, double price) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    public void view() {
        System.out.println("ID: " + id + ", Book name: " +
                bookName + ", Author name: " + authorName +
                ", Publisher: " + publisher + ", Year of publication: " +
                yearOfPublication + ", Number of pages: " + numberOfPages +
                ", Price: " + price);
    }
}
