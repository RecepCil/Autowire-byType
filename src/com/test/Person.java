package com.test;

public class Person {

    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person from {" +
                "City=" + address.getCity() + " " +
                "Country=" + address.getCountry() +
                '}';
    }
}
