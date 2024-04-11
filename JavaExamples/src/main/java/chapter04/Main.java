package chapter04;

public class Main {

    public static void main(String[] args) {

        // TODO: Instantiate a Library object called library

        Library library = new Library();

        // TODO: Instantiate 3 books — two with numPages and one without

        Book book1 = new Book("Contact", "Carl Segan", 430);
        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book3 = new Book("1984", "George Orwell");

        // TODO: Add each book to the library

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("--------------------------------------------------------");

        // TODO: Print available books

        library.printAvailableBooks();
        System.out.println("--------------------------------------------------------");

        // TODO: Check out the first book

        book1.checkOut();
        System.out.println("--------------------------------------------------------");

        // TODO: Print available books again

        library.printAvailableBooks();
        System.out.println("--------------------------------------------------------");

        // TODO: Check out the second book and check in the first book

        book2.checkOut();
        System.out.println("--------------------------------------------------------");

        book1.checkIn();
        System.out.println("--------------------------------------------------------");

        // TODO: Print available books again

        library.printAvailableBooks();


    }
}
