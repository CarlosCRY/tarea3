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

        System.out.println("Bienvenido a MeCrySoft Company Maneger 0.3c");



    }
}
