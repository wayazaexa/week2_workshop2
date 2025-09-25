package org.example;

import java.time.LocalDate;

public class Employee extends Person {
    private int employeeId;
    private static int nextEmployeeId;
    private int salary;

    public Employee(String name, LocalDate dateOfBirth, int salary) {
        super(name, dateOfBirth);
        this.employeeId = nextEmployeeId++;
        this.salary = salary;
        // super.secret = 420; // No longer viable. Subclasses has direct access to protected variables, but not private ones
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void introducePerson() {
        System.out.println("Denna anställda heter " + super.getName() + " och är född " + super.getDateOfBirth()
                + ". Hen har anställnings-ID: " + this.employeeId + " och en lön på " + this.salary);
    }
}
