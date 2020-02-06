package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public String libraryTitle;
    List<Book> bookList = new ArrayList<Book>();


    public void addBook(Book bookToAdd) {
        this.bookList.add(bookToAdd);
        System.out.printf("The book: %s is added.\n", bookToAdd.title);
    }

    public void removeBook(Book bookToRemove) {
        if (this.bookList.contains(bookToRemove)) {
            this.bookList.remove(bookToRemove);
            System.out.printf("The book: %s is deleted.\n", bookToRemove.title);
        } else {
            System.out.printf("The book: %s is not in the list.\n", bookToRemove.title);
        }
    }

    public void showBookInfo() {
        for (Book book : this.bookList) {
            System.out.println("Book title is: " + book.title);
            System.out.println("Book author is: " + book.author);
            System.out.println("Book price is: " + book.price);
        }

    }

}
