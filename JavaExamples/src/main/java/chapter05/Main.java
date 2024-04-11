package chapter05;

public class Main {

    public static void main(String[] args) {

        // TODO: Print the first available ID number if a book object were to be created
        System.out.println(Book.getNextIdNum());
        System.out.println("----------------------------------------------------------------------------------------");

        // TODO: After instantiating each book object:
        //  print its id number, then
        //  print the next available ID number now stored at the class level

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        System.out.println("\nBook 1 has an ID of " + book1.getBookId());
        System.out.println(Book.getNextIdNum());
        System.out.println("----------------------------------------------------------------------------------------");

        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        System.out.println("\nBook 2 has an ID of " + book2.getBookId());
        System.out.println(Book.getNextIdNum());
        System.out.println("----------------------------------------------------------------------------------------");

        Book book3 = new Book("1984", "George Orwell");
        System.out.println("\nBook 3 has an ID of " + book3.getBookId());
        System.out.println(Book.getNextIdNum());
        System.out.println("----------------------------------------------------------------------------------------");

        // TODO: Test the toString() method of the Book class by printing the first book
        System.out.println(book1);
        System.out.println("----------------------------------------------------------------------------------------");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks();
        System.out.println("----------------------------------------------------------------------------------------");


        // TODO: Test the toString() method of the Library class by printing the library
        System.out.println(library);
        System.out.println("----------------------------------------------------------------------------------------");


        // TODO: Create a second set of the same books as above


        // TODO: Create a second library and add all three new books to it


        // TODO: Use the strict equality operator to compare the identity of the two libraries
        System.out.println("\nAre the two libraries identical?");


        // TODO: Now use the equals() method to compare their contents
        System.out.println("\nAre the two libraries equal?");

    }
}
