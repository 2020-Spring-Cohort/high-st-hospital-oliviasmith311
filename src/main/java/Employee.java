public class Employee {

    private String name;
    protected int idNumber;
    private String jobTitle;
    protected int salary;

    public Employee(String name, int idNumber, String jobTitle, int salary) {
        this.name = name;
        this.idNumber = idNumber;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getIDNumber() {
        return idNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void payEmployees(int newSalary) {
        salary = newSalary;
    }
}
