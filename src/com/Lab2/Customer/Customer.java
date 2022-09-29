package com.Lab2.Customer;

import java.math.BigInteger;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String address;
    private BigInteger creditCardNumber;
    private int balance;

    public Customer(){
        id = -1;
        name = "No one";
        surname = "None";
        address = "No address";
        creditCardNumber = null;
        balance = -999999999;
    }

    public Customer(int id  , String name, String surname, String address, BigInteger creditCardNumber,int balance) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", Name='" + this.name + '\'' +
                ", Surname='" + this.surname + '\'' +
                ", Address='" + this.address + '\'' +
                ", creditCardNumber=" + creditCardNumber +
                ", balance=" + balance +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigInteger getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(BigInteger creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
