package com.epam.Lesson5;

import java.util.Arrays;

public class Books {
    private Book[] bookArray;
    private int counter = 0;

    public Books(int bookArrayLenght) {
        this.bookArray = new Book[bookArrayLenght];
    }

    public void addBook(Book bookToAdd) {
             if (counter < bookArray.length) {
                bookArray[counter++] = bookToAdd;
            }
        }

    public void viewAllBooks() {
        if (counter == 0) {
            System.out.println("No books were found.");
            return;
        }
        for (int i = 0; i < counter; i++) {
            bookArray[i].view();
        }
    }

    public void adjustPrice(int percent) {
        for (Book book : bookArray) {
            double currentPrice = book.getPrice();
            double changedPrice = currentPrice * (1 + (double) percent / 100);
            book.setPrice(changedPrice);
        }
    }

    public Books[] searchBooksByAuthor(String authorName) {
        Books resultArray = new Books(counter);
        for (int i = 0; i < counter; i++) {
            if (bookArray[i].getAuthorName().equalsIgnoreCase(authorName)) {
                resultArray.addBook(bookArray[i]);
            }
        }
        return resultArray;
    }

    public Book[] searchBooksByYear(int year) {
        Book[] resultArray = new Book[0];
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getYearOfPublication() > year) {
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                resultArray[resultArray.length - 1] = bookArray[i];
            }
        }
        return resultArray;
    }

}
