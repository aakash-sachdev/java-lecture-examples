package chapter05;

import java.util.ArrayList;
import java.util.Objects;

public class Library {

    // FIELDS

    // TODO: Ensure books cannot be overwritten by another object
    // Also, make books available to package
    final ArrayList<Book> books = new ArrayList<>();


    // OVERRIDE SPECIAL METHODS

    // TODO: Write a custom toString() method to print a list of all books
    // Use the StringBuilder class and iterate over books
    @Override
    public String toString() {
        StringBuilder allBookInfo = new StringBuilder();
        for (Book book :books) {
            allBookInfo.append(book.toString());
            allBookInfo.append("\n----------------------------------------\n");
        }
        return "\n Welcome to our library!\n\n" +
                "View our full collection:\n" +
                "--------------------------------\n" +
                allBookInfo;
    }


    // TODO: Write a custom equals() method to compare the contents of books
    // Use the @Override annotation
    // First include a reference check, null check, class check, and cast (see chapter 5.3.2.2)
    // Then compare the size of the books lists
    // Finally, loop through both lists and compare the books using findBook()


    // INSTANCE METHODS

    public void addBook(Book book) {
        books.add(book);
    }

    public int findBook(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    public void printAvailableBooks() {
        System.out.println("\nLIST OF BOOKS AVAILABLE:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitleAndAuthor());
            }
        }
    }
}
