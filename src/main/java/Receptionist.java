public class Receptionist extends Employee {

    static String jobTitle = "Receptionist";

    public Receptionist(String name, int idNumber, int salary) {
        super(name, idNumber, salary, jobTitle);
    }


    public boolean checkIfOnPhone(Hospital hospital) {
        if (hospital.retrievePatientListSize() > 4) {
            return true;
        } else {
            return false;
        }
    }
}
