public class Doctor extends Employee {

    private String specialty;
    static String jobTitle = "Doctor";

    public Doctor(String name, int idNumber, int salary, String specialty) {
        super(name, idNumber, salary, jobTitle);
        this.specialty = specialty;
    }

    public void drawBlood(Patient testPatient) {
        testPatient.giveBlood(10);
    }

    public void treatPatient(Patient testPatient) {
        testPatient.feelBetter(10);
    }

    public String getSpecialty() {
        return specialty;
    }
}
