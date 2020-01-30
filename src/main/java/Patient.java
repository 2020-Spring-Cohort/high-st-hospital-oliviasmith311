import java.util.ArrayList;
import java.util.HashMap;

public class Patient {


    private int bloodLevel;
    private int healthLevel;
    private String patientName;

    private HashMap<String, Patient> patientList = new HashMap<>();


    public Patient(int bloodLevel, int healthLevel) {
        this.bloodLevel = bloodLevel;
        this.healthLevel = healthLevel;
    }

    public void addPatient(Patient testPatient) {
        patientList.put(testPatient.getName(), testPatient);
    }

    private String getName() {
        return patientName;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public ArrayList<Patient> retrievePatientList() {
        return new ArrayList<>(patientList.values());
    }
}
