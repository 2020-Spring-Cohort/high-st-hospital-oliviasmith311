import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class EmployeeTest {

    private Employee underTest;

    @BeforeEach
    void setUp() {
        underTest = new Employee("TESTNAME", 1234, 100, "TESTTITLE");
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
    public void shouldHaveSpecialty(){
        Doctor testDoctor = new Doctor("TESTJOBTITLE", 1234, 100, "TESTSPECIALTY");
        String result = testDoctor.getSpecialty();
        assertEquals("TESTSPECIALTY", result);
    }

    @Test
    public void shouldBeAbleToRetrieveSalary(){
        int result = underTest.getSalary();
        assertEquals(100, result);
    }

    @Test
    public void shouldBeAbleToPayAllEmployees(){
        int result = underTest.payEmployees(10);
        assertEquals(110, result);
    }

    @Test
    public void employeesShouldKnowIfNotPaid(){
        boolean result = underTest.getIsPaid();
        assertFalse(result);
}

    @Test
    public void employeesShouldKnowIfPaid(){
        underTest.payEmployees(10);
        boolean result = underTest.getIsPaid();
        assertTrue(result);
    }

    @Test
    public void doctorShouldBeAbleToDrawBlood(){
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Doctor testDoctor = new Doctor("TESTNAME", 1234, 100, "TESTSPECIALTY");
        testDoctor.drawBlood(testPatient);
        int result = testPatient.getBloodLevel();
        assertEquals(10, result);
    }

    @Test
    public void doctorShouldBeAbleToTreatPatient(){
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Doctor testDoctor = new Doctor("TESTNAME", 1234, 100, "TESTSPECIALTY");
        testDoctor.treatPatient(testPatient);
        int result = testPatient.getHealthLevel();
        assertEquals(20, result);
    }

    @Test
    public void nurseShouldBeAbleToDrawBlood(){
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Nurse testNurse = new Nurse("TESTNAME", 1234, 100);
        testNurse.drawBlood(testPatient);
        int result = testPatient.getBloodLevel();
        assertEquals(10, result);
    }

    @Test
    public void nurseShouldBeAbleToTreatPatient() {
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Nurse testNurse = new Nurse("TESTNAME", 1234, 100);
        testNurse.treatPatient(testPatient);
        int result = testPatient.getHealthLevel();
        assertEquals(20, result);
    }

    @Test
    public void nurseShouldHaveNumberOfPatients(){
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Patient testPatient2 = new Patient("TESTNAME2", 20, 10);
        Nurse testNurse = new Nurse("TESTNAME", 1234, 100);
        Hospital underTest = new Hospital();
        underTest.addPatient(testPatient);
        underTest.addPatient(testPatient2);
        int result = testNurse.getNumberOfPatients(underTest);
        assertEquals(2, result);
    }

    @Test
    public void receptionistShouldKnowIfOnPhone(){
        Receptionist testReceptionist = new Receptionist("TESTNAME", 1234, 100);
        Hospital underTest = new Hospital();
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Patient testPatient2 = new Patient("TESTNAME2", 20, 10);
        Patient testPatient3 = new Patient("TESTNAME3", 20, 10);
        Patient testPatient4 = new Patient("TESTNAME4", 20, 10);
        Patient testPatient5 = new Patient("TESTNAME5", 20, 10);
        underTest.addPatient(testPatient);
        underTest.addPatient(testPatient2);
        underTest.addPatient(testPatient3);
        underTest.addPatient(testPatient4);
        underTest.addPatient(testPatient5);
        boolean result = testReceptionist.checkIfOnPhone(underTest);
        assertEquals(true, result);
    }

    @Test
    public void receptionistShouldKnowIfNotOnPhone() {
        Receptionist testReceptionist = new Receptionist("TESTNAME", 1234, 100);
        Hospital underTest = new Hospital();
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Patient testPatient2 = new Patient("TESTNAME2", 20, 10);
        underTest.addPatient(testPatient);
        underTest.addPatient(testPatient2);
        boolean result = testReceptionist.checkIfOnPhone(underTest);
        assertEquals(false, result);
    }

    @Test
    public void janitorShouldKnowIfNotSweeping(){
        Janitor testJanitor = new Janitor("TESTNAME", 1234, 100);
        Hospital underTest = new Hospital();
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Patient testPatient2 = new Patient("TESTNAME2", 20, 10);
        Patient testPatient3 = new Patient("TESTNAME3", 20, 10);
        Patient testPatient4 = new Patient("TESTNAME4", 20, 10);
        Patient testPatient5 = new Patient("TESTNAME5", 20, 10);
        underTest.addPatient(testPatient);
        underTest.addPatient(testPatient2);
        underTest.addPatient(testPatient3);
        underTest.addPatient(testPatient4);
        underTest.addPatient(testPatient5);
        boolean result = testJanitor.checkIfSweeping(underTest);
        assertEquals(false, result);
    }

    @Test
    public void janitorShouldKnowIfSweeping() {
        Janitor testJanitor = new Janitor("TESTNAME", 1234, 100);
        Hospital underTest = new Hospital();
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Patient testPatient2 = new Patient("TESTNAME2", 20, 10);
        underTest.addPatient(testPatient);
        underTest.addPatient(testPatient2);
        boolean result = testJanitor.checkIfSweeping(underTest);
        assertEquals(true, result);
    }
}