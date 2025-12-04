package org.practice.model;

import java.util.Arrays;
import java.util.Objects;

public class Company {
    private String name;
    private String cif;
    private Department[] departments;

    public Company (String name, String cif, Department[] departments) {
        this.name = name;
        this.cif = cif;
        this.departments = departments;
    }

    public Department findDepartmentName (String name) {
        for (Department department: departments) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    // Metodo usado por la opcion 1
    public void showDepartmentName (String name) {
        Department target = findDepartmentName(name);
        if (target != null) {
            target.showInfoP();
        } else {
            System.out.println("\nNo se encuentra el departamento");
        }
    }

    // Metodo usado por la opcion 2
    public void showEmployeesDepName (String name) {
        Department target = findDepartmentName(name);
        if (target != null) {
            target.showEmployeesInfo();
        } else {
            System.out.println("\nNo se encuentra el departamento");
        }
    }

    // Metodo usado por la opcion 3
    public void showEmpDepInfo (String name, String nif) {
        Department empDep = findDepartmentName(name);
        if (empDep != null) {
            Employee target = empDep.findEmployeeNif(nif);
            if (target != null) {
                target.showInfo();
            } else {
                System.out.println("\nNo se encuentra el empleado en el departamento");
            }
        } else {
            System.out.println("\nNo se encuentra el departamento");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(cif, company.cif) && Objects.deepEquals(departments, company.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, Arrays.hashCode(departments));
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", departments=" + Arrays.toString(departments) +
                '}';
    }
}

