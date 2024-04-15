package chapter06;

// TODO: Add imports for JUnit 5
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    // TODO: Write a test for getInitials()
    @Test
    public void initialsReturnsFromFullName() {
        String msg = "getInitials() returns only initials when given a full name";
        String expected = "ED";
        String actual = Utils.getInitials("Emily DuBois");
        assertEquals(expected,actual,msg);
    }

}
