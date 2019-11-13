package com.epam.Lesson5;

import java.util.Arrays;

public class Books {
    private Book[] bookArray;

    public Books(int bookArrayLenght) {
        this.bookArray = new Book[bookArrayLenght];
    }

    public void addBook(Book bookToAdd) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                bookArray[i] = bookToAdd;
                break;
            }
        }
    }

    public void viewAllBooks() {
        for (int i = 0; i < bookArray.length; i++) {
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

    public Book[] searchBooksByAuthor(String authorName) {
        Book[] resultArray = new Book[0];
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getAuthorName().equals(authorName)) {
                resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                resultArray[resultArray.length - 1] = bookArray[i];
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
