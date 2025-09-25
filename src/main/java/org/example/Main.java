package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person customer1 = new Customer("Kalle", LocalDate.of(1990, 1, 2));
        Employee employee = new Employee("Pelle", LocalDate.of(1991, 3, 4), 25000);
        Customer customer2 = new Customer("Lisa", LocalDate.of(1992, 5, 6));
        Product product = new Product("Ris");

        customer1.getName();
        customer2.getName();
        // customer1.getCheckoutCart(); // Cannot resolve method 'getCheckoutCart' in 'Person'
        customer2.getCheckoutCart();


        customer1.introducePerson();
        customer2.introducePerson();
        employee.introducePerson();
    }
}
