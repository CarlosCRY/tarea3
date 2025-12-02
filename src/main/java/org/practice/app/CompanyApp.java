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
            System.out.print("1. \n2. \n3. \n4. Finalizar aplicación\n");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    System.out.println("\nFinalizando la aplicación...");
                    break;

                default:
                    System.out.println("\nNo es un comando válido\n");
            }

        } while (option != 4);


        int x = scanner.nextInt();
    }
}
