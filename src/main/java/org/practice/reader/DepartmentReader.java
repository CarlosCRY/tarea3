package org.practice.reader;

import org.practice.model.Department;
import org.practice.model.Employee;

import java.util.Scanner;

public class DepartmentReader {
    private final Scanner scanner;
    private final EmployeeReader employeeReader;

    public DepartmentReader(Scanner scanner, EmployeeReader employeeReader) {
        this.scanner = scanner;
        this.employeeReader = employeeReader;
    }

    public Department read() {
        System.out.println("\nIntroduzca nombre del departamento\n");
        String name = scanner.nextLine();

        System.out.println("\nIntroduzca el presupuesto del departamento\n");
        double budget = scanner.nextDouble();
        scanner.nextLine();

        int n;
        System.out.println("\nIntroduzca la cantidad de empleados");
        do {
            n = scanner.nextInt();
            scanner.nextLine();
            if (n <= 0) {
                System.out.println("\nNo es una cantidad válida\n");
            }
        } while (n <= 0);

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            employees[i] = employeeReader.read();
            System.out.println("\nEmpleado " + (i + 1) + " Definido.");
        }

        return new Department(name, budget, employees);

    }

}
