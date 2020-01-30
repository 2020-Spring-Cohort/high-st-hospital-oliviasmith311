import java.util.HashMap;
import java.util.ArrayList;


public class Hospital {

    private HashMap<String, Employee> employeeList = new HashMap<>();

    public void addEmployee(Employee testEmployee) {
        employeeList.put(testEmployee.getName(), testEmployee);
    }

    public ArrayList<Employee> retrieveEmployeeList() {
        return new ArrayList<>(employeeList.values());
    }
}
