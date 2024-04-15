package chapter06;

// TODO: Add imports for JUnit 5
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class BookTest {

    // TODO: Declare (but do not initialize) two books
        Book book1;
        Book book2;

    // TODO: Write a @BeforeEach method to instantiate both books
    // One should use the first constructor with numPages
    // The other should use the second constructor with only title and author
    @BeforeEach
    public void createTestData() {
        book1 = new Book("Hidden Figures", "Margot Lee Shetterly", 271);
        book2 = new Book("Code Girls", "Liza Mundy");
    }

    // TODO: Test that the primary constructor correctly sets value for title
    @Test
    public void firstConstructorSetsTitles() {
        String msg = "constructor sets title";
        String expected = "Hidden Figures";
        String actual = book1.getTitle();
        assertEquals(expected,actual,msg);
    }

    // TODO: Test that the primary constructor correctly sets value for author
    @Test
    public void firstConstructorSetsAuthor() {
        String msg = "constructor sets author";
        String expected = "Margot Lee Shetterly";
        String actual = book1.getAuthor();
        assertEquals(expected,actual,msg);
    }


    // TODO: Test that the primary constructor correctly sets value for numPages
    @Test
    public void firstConstructorSetsNumPages() {
        String msg = "constructor sets the number of pages";
        int expected = 271;
        int actual = book1.getNumPages();
        assertEquals(expected,actual,msg);
    }

    // TODO: Test that the secondary constructor will assign a value of 0 to numPages
    @Test
    public void secondConstructorSetsNumPages() {
        String msg = "constructor sets the number of pages to zero when not specified";
        int expected = 0;
        int actual = book2.getNumPages();
        assertEquals(expected,actual,msg);
    }

    // TODO: Test that a book ID is correctly generated using the next available number
    // This will involve checking the next ID number before instantiating a new book
    @Test
    public void bookIdGenerated(){
        String msg = "a book ID is correctly generated using the static field nextIdNum";
        String expected = "SM-THE-" + Book.getNextIdNum();
        Book book3 = new Book("The Secret Life of Bletchley Park", "Sinclair Mckay", 322);
        String actual = book3.getBookId();
        assertEquals(expected,actual,msg);
    }

    // TODO: Test that getTitleAndAuthor() correctly concatenates the title and author
    @Test
    public void titleAndAuthorConcatenated(){
        String msg = "getTitleAndAuthor() correctly concatenates the title and author";
        String expected = "Code Girls by Liza Mundy";
        String actual = book2.getTitleAndAuthor();
        assertEquals(expected,actual,msg);

    }

    // TODO: Test the checkOut() method increases the number of times the book has been checked out
    @Test
    public void checkingOutBookIncreasesTimesCheckedOut(){
        String msg = "timesCheckOut is increased by 1 when book is checked out";
        book1.checkOut();
        int expected = 1;
        int actual = book1.getTimesCheckedOut();
        assertEquals(expected,actual,msg);
    }

    // TODO: Test the checkOut() method changes isAvailable to false
    @Test
    public void checkingOutBookMakesItUnvailable(){
        String msg = "available is set to false when book is checked out";
        book1.checkOut();
        boolean condition = book1.isAvailable();
        assertFalse(condition,msg);
    }


    // TODO: Test the checkIn() method changes isAvailable to true
    // Use checkOut() first so that isAvailable will be false
    @Test
    public void checkingInBookMakesItAvailable(){
        String msg = "available is set to true when book is checked in";
        book1.checkOut();
        book1.checkIn();
        boolean condition = book1.isAvailable();
        assertTrue(condition,msg);
    }

}
