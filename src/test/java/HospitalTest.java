import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HospitalTest {

    @Test
    public void shouldBeAbleToAddEmployee() {
        Employee testEmployee = new Employee("TESTNAME", 1234, "TESTTITLE", 100);
        Hospital underTest = new Hospital();
        underTest.addEmployee(testEmployee);
        ArrayList<Employee> retrievedEmployees = underTest.retrieveEmployeeList();
        assertEquals(1, retrievedEmployees.size());
    }
}