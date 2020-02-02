import java.util.ArrayList;
import java.util.HashMap;

public class Patient extends Hospital{


    private int bloodLevel;
    private int healthLevel;
    protected String patientName;


    public Patient(String patientName, int bloodLevel, int healthLevel) {
        this.bloodLevel = bloodLevel;
        this.healthLevel = healthLevel;
        this.patientName = patientName;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getPatientName() {
        return patientName;
    }

    public void giveBlood(int bloodAmount) {
        bloodLevel -= bloodAmount;
    }

    public void feelBetter(int healthImprovementLevel) {
        healthLevel += healthImprovementLevel;
    }
}
