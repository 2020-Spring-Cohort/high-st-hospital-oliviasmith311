import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class EmployeeTest {

    private Employee underTest;

    @BeforeEach
    void setUp() {
        underTest = new Employee("TESTNAME", 1234, "TESTJOBTITLE", 100);
    }

    @Test
    public void shouldHaveName() {
        String result = underTest.getName();
        assertEquals("TESTNAME", result);
    }

    @Test
    public void shouldHaveIDNumber() {
        int result = underTest.getIDNumber();
        assertEquals(1234, result);
    }

    @Test
    public void shouldHaveJobTitle(){
        String result = underTest.getJobTitle();
        assertEquals("TESTJOBTITLE", result);
    }

    @Test
    public void shouldBeAbleToRetrieveSalary(){
        int result = underTest.getSalary();
        assertEquals(100, result);
    }

    @Test
    public void shouldBeAbleToPayAllEmployees(){
        underTest.payEmployees(110);
        int result = underTest.getSalary();
        assertEquals(110, result);
    }
}
