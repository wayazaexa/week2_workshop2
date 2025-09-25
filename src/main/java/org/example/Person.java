package org.example;

import java.time.LocalDate;

public abstract class Person {
    private String name;
    private LocalDate dateOfBirth;
    private int secret;

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public abstract void introducePerson();
    // Alternatively:
    /*public void introducePerson() {
        System.out.println("Denna person heter " + this.name + " och är född " + dateOfBirth);
    }*/
}
