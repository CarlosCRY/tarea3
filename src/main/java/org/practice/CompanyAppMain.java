package org.practice;

import org.practice.app.CompanyApp;
import org.practice.reader.CompanyReader;
import org.practice.reader.DepartmentReader;
import org.practice.reader.EmployeeReader;

import java.util.Scanner;

public class CompanyAppMain {
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        EmployeeReader employeeReader = new EmployeeReader(scanner);
        DepartmentReader departmentReader = new DepartmentReader (scanner, employeeReader);
        CompanyReader companyReader = new CompanyReader (scanner, departmentReader);
        CompanyApp app = new CompanyApp (scanner, companyReader);

        app.run();

    }

}
