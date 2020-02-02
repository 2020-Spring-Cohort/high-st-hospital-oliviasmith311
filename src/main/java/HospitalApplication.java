import java.util.Scanner;

public class HospitalApplication {

    private static final Scanner input = new Scanner(System.in);
    private static Hospital hospital = new Hospital();
    private static Employee employee = new Employee("TESTNAME", 1234, 100, "TESTTITLE");
    private static Doctor doctor = new Doctor("John", 1001, 90000, "Heart");
    private static Doctor doctor2 = new Doctor("James", 1002, 90000, "Foot");
    private static Doctor doctor3 = new Doctor("Jill", 1003, 90000, "Brain");
    private static Nurse nurse = new Nurse("Jim", 1004, 50000);
    private static Receptionist receptionist = new Receptionist("Jane", 1006, 45000);
    private static Janitor janitor = new Janitor("Julia", 1007, 40000);
    private static Patient patient1 = new Patient("Bill", 20, 10);
    private static Patient patient2 = new Patient("Bob", 20, 10);
    private static Patient patient3 = new Patient("Beth", 20, 10);
    private static Patient patient4 = new Patient("Brenda", 20, 10);

    public static void main(String[] args) {

        System.out.println("Welcome to the High St. Hospital.");
        hireEmployees();
        addPatients();
        payEmployeeList();
        getNumberOfNursePatients();
        checkIfReceptionistOnPhone();
        checkIfJanitorIsSweeping();
        addMorePatients();
        checkIfReceptionistOnPhone();
        checkIfJanitorIsSweeping();
        treatAPatient();
    }

    private static void hireEmployees() {
        hospital.addEmployee(doctor);
        hospital.addEmployee(doctor2);
        hospital.addEmployee(doctor3);
        hospital.addEmployee(nurse);
        hospital.addEmployee(receptionist);
        hospital.addEmployee(janitor);
        System.out.println("\nLet's see a list of our employees.");
        hospital.printEmployeeList();
    }

    private static void addPatients() {
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);
        System.out.println("\nLet's see a list of our patients.");
        hospital.printPatientList();
    }

    private static void payEmployeeList() {
        System.out.println("\nHave our employees been paid? The answer is " + employee.getIsPaid() + "!");
        System.out.println("Let's pay our employees");
        employee.payEmployees(1500);
        System.out.println("Have our employees been paid? The answer is " + employee.getIsPaid() + "!");
        System.out.println("Now our employees can ball out! Cha-ching!");
    }

    private static void getNumberOfNursePatients() {
        System.out.println("\nLet's see how many patients our nurse is helping.");
        System.out.println(hospital.retrievePatientListSize());
        System.out.println("Wow! That's a lot of patients! " + nurse.getName() + " is truly a superhero.");
    }

    private static void checkIfReceptionistOnPhone() {
        System.out.println("\nIs our receptionist on the phone?");
        System.out.println("The answer is " + receptionist.checkIfOnPhone(hospital));
        if (receptionist.checkIfOnPhone(hospital) == false) {
            System.out.println("I guess no one is calling right now!");
        } else {
            System.out.println(receptionist.getName() + " seems busy!");
        }
    }

    public static void checkIfJanitorIsSweeping() {
        System.out.println("\nIs our janitor currently sweeping?");
        System.out.println("The answer is " + receptionist.checkIfOnPhone(hospital));
        if (receptionist.checkIfOnPhone(hospital) == false) {
            System.out.println("I guess there are no messes to clean right now!");
        } else {
            System.out.println(janitor.getName() + " seems busy!");
        }
    }

    private static void addMorePatients() {
        System.out.println("\nIt looks a new patient just came!");
        Patient patient5 = new Patient("Barb", 20, 10);
        hospital.addPatient(patient5);
        System.out.println("\nLet's see a list of our patients.");
        hospital.printPatientList();
        System.out.println("\nThat's a lot of patients! Let's see how our receptionist is holding up.");
    }

    private static void treatAPatient() {
        System.out.println("\nLet's treat one of our patients.");
        System.out.println("Which doctor or nurse would you like to have treat a patient?");
        String chosenEmployee = chooseDoctorOrNurse();
        System.out.println("Great! Which patient would you like " + chosenEmployee + " to treat?");
        String chosenPatient = choosePatient();
        Patient patientToTreat = new Patient("TESTNAME", 20, 10);

        if (chosenPatient == "Bill") {
            patientToTreat = patient1;
        } else if (chosenPatient == "bOB") {
            patientToTreat = patient2;
        } else if (chosenPatient == "Beth") {
            patientToTreat = patient3;
        } else if (chosenPatient == "Brenda") {
            patientToTreat = patient4;
        }

        System.out.println(patientToTreat.getPatientName() + "'s current health is at " + patientToTreat.getHealthLevel() + ".");
        System.out.println(chosenEmployee + " is going to treat " + chosenPatient + "!");

        switch (chosenEmployee) {
            case "John":
                doctor.treatPatient(patientToTreat);
                break;
            case "James":
                doctor2.treatPatient(patientToTreat);
                break;
            case "Jill":
                doctor3.treatPatient(patientToTreat);
                break;
            case "Jim":
                nurse.treatPatient(patientToTreat);
                break;
        }

        System.out.println("Let's see how " + patientToTreat.getPatientName() + "is feeling!");
        System.out.println(patientToTreat.getPatientName() + "'s new health level is " + patientToTreat.getHealthLevel());
        System.out.println(patientToTreat.getPatientName() + " is feeling much better!");
    }

    private static String chooseDoctorOrNurse() {
        System.out.println(doctor.getName());
        System.out.println(doctor2.getName());
        System.out.println(doctor3.getName());
        System.out.println(nurse.getName());
        return input.nextLine();
    }

    private static String choosePatient() {
        System.out.println(patient1.getPatientName());
        System.out.println(patient2.getPatientName());
        System.out.println(patient3.getPatientName());
        System.out.println(patient4.getPatientName());
        return input.nextLine();
    }
}
