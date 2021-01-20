package com.company;

public class Passanger {
    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public static void setIdCounter(int idCounter) {
        Passanger.idCounter = idCounter;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContact() {
        return contact;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    private Address address;
    private Contact contact;
    private static int idCounter = 0;

    /*public int getIdCounter() {
        return idCounter;
    }

    public void setId(int idCounter) {
        
        this.idCounter = idCounter;
    }*/
    Passanger(String street, String city, String state, String name, String mobile, String email, int idCounter) {
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, mobile, email);
        idCounter++;
    }

    private int getPassangerCount() {
        return idCounter;
    }

    String getContactDetails() {

        return contact;
    }

    public void updateContactDetails(String contactDetails) {

    }

    public String toString() {
        return "Passenger{" +
                "address=" + address +
                ", contact=" + contact +
                ", idCounter=" + idCounter +
                '}';

    }
}
