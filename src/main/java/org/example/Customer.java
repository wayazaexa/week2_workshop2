package org.example;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer extends Person{
    private int customerId;
    private static int nextCustomerId;
    private ArrayList<Product> checkoutCart;

    public Customer(String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
        this.customerId = nextCustomerId++;
        // super.secret = 42; // No longer viable. Subclasses has direct access to protected variables, but not private ones
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public ArrayList<Product> getCheckoutCart() {
        return checkoutCart;
    }

    public void setCheckoutCart(ArrayList<Product> checkoutCart) {
        this.checkoutCart = checkoutCart;
    }

    @Override
    public void introducePerson() {
        System.out.println("Denna kund heter " + super.getName() + " och är född " + super.getDateOfBirth()
                            + ". Kunden har kund-ID: " + this.customerId);
    }
}
