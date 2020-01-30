import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class PatientTest {

    private Patient underTest;
    private Patient testPatient;

    @BeforeEach
    void setUp() {
        testPatient = new Patient(10, 10);
        underTest.addPatient(testPatient);
    }

    @Test
    public void shouldBeAbleToAddPatient() {
        ArrayList<Patient> retrievedPatients = underTest.retrievePatientList();
        assertEquals(1, retrievedPatients.size());
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

//    @Test
//    public void shouldBeAbleToDecreaseBloodLevel(){
//        int result = underTest.drawBlood();
//    }
}
