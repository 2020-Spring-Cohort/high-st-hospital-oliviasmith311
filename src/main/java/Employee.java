public class Employee {

    private String name;
    protected int idNumber;
    private String jobTitle;
    protected int salary;

    protected boolean isPaid = false;

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public Employee(String name, int idNumber, int salary, String jobTitle) {
        this.name = name;
        this.idNumber = idNumber;
        this.salary = salary;
        this.jobTitle = jobTitle;
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

    public int payEmployees(int payRate) {
        setPaid(true);
        return this.salary += payRate;
    }
}

