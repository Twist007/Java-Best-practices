package com.company;

import Library.Library;
import Library.Book;

/*Нека е дадена библиотека с книги.
Дефинирайте класове съответно за библиотека и книга. Библиотеката трябва да съдържа име и списък от книгите.
Книгите трябва да съдържат информация за заглавие, автор,
В класа, който описва библиотекат, добавете методи за добавяне нa книга към библиотеката и премахване на книгата.
извеждане на информация за дадена книга и изтриване на книга от библиотеката.
Създайте LibraryDemo където да изтествате окетите си.
override ToString()
 */
public class Main {

    public static void main(String[] args) {
        Library bookTrading = new Library();
        bookTrading.libraryTitle = "Book Trading";

        Library orange = new Library();
        orange.libraryTitle = "Orange";


        Book got = new Book();
        got.title = "Game of Thrones";
        got.author = "George R. R. Martin";
        got.price = 22.99;

        bookTrading.addBook(got);

        Book harryPotter = new Book();
        harryPotter.title = "Harry Potter";
        harryPotter.author = "J. K. Rowling";
        harryPotter.price = 15.4;

        orange.addBook(harryPotter);

        bookTrading.showBookInfo();

        orange.showBookInfo();
    }
}
