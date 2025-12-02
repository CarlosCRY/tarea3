package org.practice.reader;

import org.practice.model.Company;
import org.practice.model.Department;

import java.util.Scanner;

public class CompanyReader {
    private final Scanner scanner;
    private final DepartmentReader departmentReader;

    public CompanyReader(Scanner scanner, DepartmentReader departmentReader) {
        this.scanner = scanner;
        this.departmentReader = departmentReader;
    }

    public Company read() {
        System.out.println("\nIntroduzca nombre de la compañía\n");
        String name = scanner.nextLine();

        System.out.println("\nIntroduzca CIF de la compañía\n");
        String cif = scanner.nextLine();

        int n;
        System.out.println("\nIntroduzca la cantidad de departamentos");
        do {
            n = scanner.nextInt();
            scanner.nextLine();
            if (n <= 0) {
                System.out.println("\nNo es una cantidad válida\n");
            }
        } while (n <= 0);

        Department[] departments = new Department[n];

        for (int i = 0; i < n; i++) {
            departments[i] = departmentReader.read();
            System.out.println("\nDepartamento " + (i + 1) + " Definido.");
        }

        return new Company (name, cif, departments);

    }

}
