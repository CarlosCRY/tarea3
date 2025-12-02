package org.practice.reader;

import org.practice.model.Employee;
import org.practice.model.JobPosition;

import java.util.Scanner;

public class EmployeeReader {
    private final Scanner scanner;

    public EmployeeReader (Scanner scanner) {
        this.scanner = scanner;
    }

    public Employee read() {
        System.out.println("\nIntroduzca NIF del empleado\n");
        String nif = scanner.nextLine();

        System.out.println("\nIntroduzca nombre del empleado\n");
        String name = scanner.nextLine();

        System.out.println("\nIntroduzca apellidos del empleado\n");
        String surname = scanner.nextLine();

        System.out.println("\nIntroduzca el puesto del empleado");
        int option;
        JobPosition position = null;
        do {
            // programmer, projectChief, executive, assistant, other
            System.out.println("\nOpciones:\n1. Programador\n2. Jefe de proyecto\n3. Ejecutivo");
            System.out.println("4. Asistente\n5. Otro");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                position = JobPosition.Programmer;
            } else if (option == 2) {
                position = JobPosition.ProjectChief;
            } else if (option == 3) {
                position = JobPosition.Executive;
            } else if (option == 4) {
                position = JobPosition.Assistant;
            } else if (option == 5) {
                position = JobPosition.Other;
            } else {
                System.out.println("\nNo es una opción válida.\n");
                option = 0;
            }
        } while (option == 0);

        return new Employee(nif, name, surname, position);

    }

}
