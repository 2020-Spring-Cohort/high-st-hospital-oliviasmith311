import javax.print.Doc;
import java.util.HashMap;
import java.util.ArrayList;


public class Hospital {

    private HashMap<String, Employee> employeeList = new HashMap<>();
    private HashMap<String, Patient> patientList = new HashMap<>();
    ArrayList<Patient> retrievedPatientList = new ArrayList<>();

    public void addEmployee(Employee testEmployee){
        employeeList.put(testEmployee.getName(), testEmployee);
    }

    public ArrayList<Employee> retrieveEmployeeList(){
        return new ArrayList<>(employeeList.values());
    }

    public void addPatient(Patient testPatient){
        patientList.put(testPatient.getPatientName(), testPatient);
    }

    public ArrayList<Patient> retrievePatientList(){
        retrievedPatientList = new ArrayList<>(patientList.values());
        return retrievedPatientList;
    }

    public int retrievePatientListSize(){
        return patientList.size();
    }

    public void printPatientList(){
        for (Patient patient : patientList.values()) {
            System.out.println("Name: " + patient.getPatientName() +
                    " Blood Level: " + patient.getBloodLevel() +
                    " Health Level: " + patient.getHealthLevel()
            );
        }
    }

    public void printEmployeeList(){
        for (Employee employee : employeeList.values()) {
            System.out.println("Name: " + employee.getName() +
                    " ID Number: " + employee.getIDNumber() +
                    " Job Title: " + employee.getJobTitle() +
                    " Salary: " + employee.getSalary());
//            if (employee.getJobTitle() == "Doctor"){
//                System.out.println(doctor.getSpecialty);
//            }
        }
    }
}