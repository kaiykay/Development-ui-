#include <stdio.h>
#include <string.h>

// Structure to hold information about a root canal treatment
struct RootCanal {
    char patientName[50];
    char toothNumber[5];
    char condition[100];
    char procedureSteps[500];
};

void displayTreatmentInfo(struct RootCanal treatment);

int main() {
    struct RootCanal treatment;

    // Input patient information
    printf("Enter patient's name: ");
    fgets(treatment.patientName, sizeof(treatment.patientName), stdin);
    treatment.patientName[strcspn(treatment.patientName, "\n")] = 0;  // Remove newline

    printf("Enter tooth number: ");
    fgets(treatment.toothNumber, sizeof(treatment.toothNumber), stdin);
    treatment.toothNumber[strcspn(treatment.toothNumber, "\n")] = 0;  // Remove newline

    printf("Enter condition of the tooth (e.g., decay, infection): ");
    fgets(treatment.condition, sizeof(treatment.condition), stdin);
    treatment.condition[strcspn(treatment.condition, "\n")] = 0;  // Remove newline

    printf("Enter procedure steps: ");
    fgets(treatment.procedureSteps, sizeof(treatment.procedureSteps), stdin);
    treatment.procedureSteps[strcspn(treatment.procedureSteps, "\n")] = 0;  // Remove newline

    // Display treatment information
    displayTreatmentInfo(treatment);

    return 0;
}

void displayTreatmentInfo(struct RootCanal treatment) {
    printf("\n--- Root Canal Treatment Information ---\n");
    printf("Patient Name: %s\n", treatment.patientName);
    printf("Tooth Number: %s\n", treatment.toothNumber);
    printf("Condition: %s\n", treatment.condition);
    printf("Procedure Steps: %s\n", treatment.procedureSteps);
}
