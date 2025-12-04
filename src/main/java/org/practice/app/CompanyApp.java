package org.practice.app;

import org.practice.model.Company;
import org.practice.reader.CompanyReader;

import java.util.Scanner;

public class CompanyApp {
    private final Scanner scanner;
    private final CompanyReader companyReader;

    public CompanyApp (Scanner scanner, CompanyReader companyReader) {
        this.scanner = scanner;
        this.companyReader = companyReader;
    }

    public void run () {
        System.out.println("MeCrySoft Company Manager 0.3c\ndatabase input");
        Company company = companyReader.read();
        System.out.println("\ndatabase input satisfactory\ninitialize main...");

        System.out.println("Bienvenido a MeCrySoft Company Manager 0.3c");

        int option;
        do {
            System.out.println("\nComandos disponibles:");
            System.out.println("1. Informe de departamento\n2. Informe de empleados");
            System.out.println("3. Datos del empleado\n4. Finalizar aplicación\n");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    departmentInfo(company);
                    break;

                case 2:
                    employeesInfo(company);
                    break;

                case 3:
                    singleEmployeeInfo(company);
                    break;

                case 4:
                    System.out.println("\nFinalizando la aplicación...");
                    break;

                default:
                    System.out.println("\nNo es un comando válido\n");
            }

        } while (option != 4);
    }

    public void departmentInfo (Company company) {
        System.out.println("\nIntroduzca el nombre del departamento que quiere buscar");
        company.showDepartmentName(scanner.nextLine());
    }

    public void employeesInfo (Company company) {
        System.out.println("\nIntroduzca el nombre del departamento al que pertenezcan los empleados que quiere buscar");
        company.showEmployeesDepName(scanner.nextLine());
    }

    public void singleEmployeeInfo (Company company) {
        System.out.println("\nIntroduzca el nombre del departamento del empleado");
        String depName = scanner.nextLine();

        System.out.println("\nIntroduzca el NIF del empleado");
        String empNif = scanner.nextLine();

        company.showEmpDepInfo(depName, empNif);
    }
}
