import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    @Test
    public void shouldBeAbleToAddEmployee() {
        Employee testEmployee = new Employee("TESTNAME", 1234, 100, "TESTTITLE");
        Hospital underTest = new Hospital();
        underTest.addEmployee(testEmployee);
        ArrayList<Employee> retrievedEmployees = underTest.retrieveEmployeeList();
        assertEquals(1, retrievedEmployees.size());
    }

    @Test
    public void shouldBeAbleToAddPatient() {
        Patient testPatient = new Patient("TESTNAME", 20, 10);
        Patient testPatient2 = new Patient("TESTNAME2", 20, 10);
        Hospital underTest = new Hospital();
        underTest.addPatient(testPatient);
        underTest.addPatient(testPatient2);
        ArrayList<Patient> retrievedPatients = underTest.retrievePatientList();
        assertEquals(2, retrievedPatients.size());
    }

    @Test
    public void shouldPrintEmployeeList(){
     Doctor testEmployee1 = new Doctor("TESTNAME1", 1234, 100, "TESTSPECIALTY");
     Nurse testEmployee2 = new Nurse("TESTNAME2", 1235, 101);
     Hospital underTest = new Hospital();
     underTest.addEmployee(testEmployee1);
     underTest.addEmployee(testEmployee2);
     underTest.printEmployeeList();
     System.out.println(testEmployee1.getName());
    }
}