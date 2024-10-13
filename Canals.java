import java.util.Scanner;

class RootCanal {
    private String patientName;
    private String toothNumber;
    private String condition;
    private String procedureSteps;

    // Constructor
    public RootCanal(String patientName, String toothNumber, String condition, String procedureSteps) {
        this.patientName = patientName;
        this.toothNumber = toothNumber;
        this.condition = condition;
        this.procedureSteps = procedureSteps;
    }

    // Method to display treatment information
    public void displayTreatmentInfo() {
        System.out.println("\n--- Root Canal Treatment Information ---");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Tooth Number: " + toothNumber);
        System.out.println("Condition: " + condition);
        System.out.println("Procedure Steps: " + procedureSteps);
    }
}

public class RootCanalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input patient information
        System.out.print("Enter patient's name: ");
        String patientName = scanner.nextLine();

        System.out.print("Enter tooth number: ");
        String toothNumber = scanner.nextLine();

        System.out.print("Enter condition of the tooth (e.g., decay, infection): ");
        String condition = scanner.nextLine();

        System.out.print("Enter procedure steps: ");
        String procedureSteps = scanner.nextLine();

        // Create a RootCanal object
        RootCanal treatment = new RootCanal(patientName, toothNumber, condition, procedureSteps);

        // Display treatment information
        treatment.displayTreatmentInfo();

        // Close the scanner
        scanner.close();
    }
  }
