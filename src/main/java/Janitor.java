public class Janitor extends Employee {

    static String jobTitle = "Janitor";

    public Janitor(String name, int idNumber, int salary) {
        super(name, idNumber, salary, jobTitle);
    }


    public boolean checkIfSweeping(Hospital hospital) {
        if (hospital.retrievePatientListSize() < 3) {
            return true;
        } else {
            return false;
        }
    }
}
