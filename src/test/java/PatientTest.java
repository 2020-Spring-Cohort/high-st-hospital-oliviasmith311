import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class PatientTest {

    private Patient underTest;


    @BeforeEach
    void setUp() {
        underTest = new Patient("TESTNAME", 20, 10);
    }

    @Test
    public void shouldHaveName(){
        String result = underTest.getPatientName();
        assertEquals("TESTNAME", result);
    }

    @Test
    public void shouldBeAbleToGetBloodLevel(){
        int result = underTest.getBloodLevel();
        assertEquals(10, result);
    }

    @Test
    public void shouldBeAbleToGetHealthLevel() {
        int result = underTest.getHealthLevel();
        assertEquals(10, result);
    }
}
