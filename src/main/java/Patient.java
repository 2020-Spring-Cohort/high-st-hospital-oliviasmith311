import java.util.ArrayList;
import java.util.HashMap;

public class Patient extends Hospital{


    private int bloodLevel;
    private int healthLevel;


    public Patient(int bloodLevel, int healthLevel) {
        this.bloodLevel = bloodLevel;
        this.healthLevel = healthLevel;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }
}
