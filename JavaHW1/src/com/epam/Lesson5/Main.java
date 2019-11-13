package com.epam.Lesson5;

import com.epam.Lesson5.Book;
import com.epam.Lesson5.Books;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of percent");
        int percent = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter author");
        String authorName = sc.nextLine();
        System.out.println("Enter year");
        int year = sc.nextInt();
        Books books = new Books(10);
        books.addBook(new Book(1, "Goodnight Moon", "Margaret Brown",
                "National Education Association", 1947, 250, 9.5));
        books.addBook(new Book(2, "The Very Hungry Caterpillar", "Eric Carle",
                "Privat Education Association", 1969, 380, 7.0));
        books.addBook(new Book(3, "Where the Wild Things Are", "Maurice Sendak",
                "Caldecott Medal", 1963, 730, 6.4));
        books.addBook(new Book(4, "The Cat in the Hat", "Dr. Seuss",
                "Theodor Geisel", 1957, 430, 7.5));
        books.addBook(new Book(5, "Charlotte’s Web", "E. B. White",
                "English literature", 1952, 1320, 6.3));
        books.addBook(new Book(6, "Harold and the Purple Crayon", "Crockett Johnson",
                "Through this power", 1955, 250, 9.5));
        books.addBook(new Book(7, "Charlie and the Chocolate Factory", "Roald Dahl",
                "Willy Wonka", 1964, 1250, 5.0));
        books.addBook(new Book(8, "Little Women", "Louis May Alcott",
                "National Education Association", 1880, 860, 12.5));
        books.addBook(new Book(9, "Harry Potter and the Philosopher’s Stone", "Margaret Brown",
                " British and American awards", 1997, 780, 7.5));
        books.addBook(new Book(10, "The Chronicles of Narnia: The Lion, the Witch and the Wardrobe", "C.S.Lewis",
                "Narnia", 1950, 1400, 9));
        System.out.println("All library:");
        books.viewAllBooks();
        books.adjustPrice(percent);
        Book[] filteredByYear = books.searchBooksByYear(year);
        System.out.println("Books filtered by author: ");
        printFoundBooks(books.searchBooksByAuthor(authorName));
        System.out.println("Books filtered by year: ");
        printFoundBooks(filteredByYear);
    }

    private static void printFoundBooks(Book[] booksToPrint) {
        if (booksToPrint.length != 0) {
            for (int i = 0; i < booksToPrint.length; i++) {
                booksToPrint[i].view();
            }
        } else {
            System.out.println("Nothing was found.");
        }
    }
}
