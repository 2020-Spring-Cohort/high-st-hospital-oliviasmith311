public class Nurse extends Employee {

    static String jobTitle = "Nurse";

    public Nurse(String name, int idNumber, int salary) {
        super(name, idNumber, salary, jobTitle);
    }

    public void drawBlood(Patient testPatient) {
        testPatient.giveBlood(10);
    }

    public void treatPatient(Patient testPatient) {
        testPatient.feelBetter(10);
    }

    public int getNumberOfPatients(Hospital hospital){
        return hospital.retrievePatientListSize();
    }
}
