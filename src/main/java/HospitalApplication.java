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

        System.out.println("Welcome to the High St. Hospital!");
        hireEmployees();
        addPatients();
        payEmployeeList();
        getNumberOfNursePatients();
        checkIfReceptionistOnPhone();
        checkIfJanitorIsSweeping();
        addMorePatients();
        checkIfReceptionistOnPhone();
        checkIfJanitorIsSweeping();
        drawAPatientsBlood();
        treatAPatient();
        printGoodbye();
    }


    private static void hireEmployees() {
        hospital.addEmployee(doctor);
        hospital.addEmployee(doctor2);
        hospital.addEmployee(doctor3);
        hospital.addEmployee(nurse);
        hospital.addEmployee(receptionist);
        hospital.addEmployee(janitor);
        System.out.println("\nLet's see a list of our employees.\n");
        hospital.printEmployeeList();
    }

    private static void addPatients() {
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);
        System.out.println("\nLet's see a list of our patients.\n");
        hospital.printPatientList();
    }

    private static void payEmployeeList() {
        System.out.println("\nHave our employees been paid? The answer is " + employee.getIsPaid() + "!");
        System.out.println("Let's pay our employees\n");
        employee.payEmployees(1500);
        System.out.println("Have our employees been paid? The answer is now " + employee.getIsPaid() + "!");
        System.out.println("Now our employees can ball out! Cha-ching!");
    }

    private static void getNumberOfNursePatients() {
        System.out.println("\nLet's see how many patients our nurse is helping.");
        System.out.println("Currently, our nurse is helping " + hospital.retrievePatientListSize() + " patients.");
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
        String chosenEmployee2 = chooseDoctorOrNurse();
        System.out.println("\nGreat! Which patient would you like " + chosenEmployee2 + " to treat?");
        String chosenPatient2 = choosePatient();
        System.out.println(chosenPatient2);
        Patient patientToTreat = hospital.getOnePatient(chosenPatient2);

        if (chosenPatient2.equals("Bill")) {
            patientToTreat = patient1;
        } else if (chosenPatient2.equalsIgnoreCase("Bob")) {
            patientToTreat = patient2;
        } else if (chosenPatient2.equals("Beth")) {
            patientToTreat = patient3;
        } else if (chosenPatient2.equals("Brenda")) {
            patientToTreat = patient4;
        }

        System.out.println("\n" + patientToTreat.getPatientName() + "'s current health is at " + patientToTreat.getHealthLevel() + ".");
        System.out.println("\n" + chosenEmployee2 + " is going to treat " + chosenPatient2 + "!");

        switch (chosenEmployee2) {
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

        System.out.println("\nLet's see how " + patientToTreat.getPatientName() + " is feeling!");
        System.out.println(patientToTreat.getPatientName() + "'s new health level is " + patientToTreat.getHealthLevel());
        System.out.println(patientToTreat.getPatientName() + " is feeling much better!");
    }

    private static void drawAPatientsBlood() {
        System.out.println("\nLet's draw blood from a patient.");
        System.out.println("Which doctor or nurse would you like to have draw blood?");
        String chosenEmployee = chooseDoctorOrNurse();
        System.out.println("\nGreat! Which patient would you like " + chosenEmployee + " to draw blood from?");
        String chosenPatient = choosePatient();
        Patient patientToDrawBlood = patient1;

        if (chosenPatient.equals("Bill")) {
            patientToDrawBlood = patient1;
        } else if (chosenPatient.equalsIgnoreCase("Bob")) {
            patientToDrawBlood = patient2;
        } else if (chosenPatient.equals("Beth")) {
            patientToDrawBlood = patient3;
        } else if (chosenPatient.equals("Brenda")) {
            patientToDrawBlood = patient4;
        }

        System.out.println("\n" + patientToDrawBlood.getPatientName() + "'s current blood level is at " + patientToDrawBlood.getBloodLevel() + ".");
        System.out.println("\n" + chosenEmployee + " is going to draw blood from " + chosenPatient + "!");

        switch (chosenEmployee) {
            case "John":
                doctor.drawBlood(patientToDrawBlood);
                break;
            case "James":
                doctor2.drawBlood(patientToDrawBlood);
                break;
            case "Jill":
                doctor3.drawBlood(patientToDrawBlood);
                break;
            case "Jim":
                nurse.drawBlood(patientToDrawBlood);
                break;
        }

        System.out.println("\nLet's see what " + patientToDrawBlood.getPatientName() + "'s blood level is now!");
        System.out.println(patientToDrawBlood.getPatientName() + "'s new blood level is " + patientToDrawBlood.getBloodLevel());
        System.out.println(patientToDrawBlood.getPatientName() + " is feeling a bit woozy!");
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

    private static void printGoodbye() {
        System.out.println("\nThank you for visiting the High St. Hospital! Goodbye!");
    }
}