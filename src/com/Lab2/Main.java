package com.Lab2;

import com.Lab2.Customer.Customer;
import com.Lab2.Data.RandomData;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer[] customers = new Customer[10];

        for(int i=0; i< customers.length; i++){
            customers[i] = new Customer(i+1,RandomData.getName(),RandomData.getSurname(),RandomData.getAddress(),RandomData.getCardNumber(),RandomData.getBalance());
        }

        for(Customer customer: customers){
            System.out.println(customer);
        }
        System.out.println("---------------Customers with name Ronny-----------------");

        System.out.println(customersToString(getAllByName(customers, "Ronny")));

        System.out.println("--------Customers inside of interval of credit card------");

        System.out.println(customersToString(getAllByCreditNumber(customers,new BigInteger("4444444444444444"), new BigInteger("8888888888888888"))));
        System.out.println("-----------------Customers with debt --------------------");
        Customer[] customersWithDebt = getAllByDebt(customers);
        System.out.println(customersToString(customersWithDebt));
        System.out.println(System.lineSeparator()+"Quantity of customers with debt: "+ customersWithDebt.length);
    }

    public static Customer[] getAllByName(Customer[] customers, String name){
        List<Customer> customersName = new ArrayList<>();
        for(Customer customer: customers){
            if(customer.getName().equals(name)){
                customersName.add(customer);
            }
        }
        return customersName.toArray(Customer[]::new);
    }

    public static Customer[] getAllByCreditNumber(Customer[] customers, BigInteger min, BigInteger max){
        List<Customer> customersName = new ArrayList<>();
        for(Customer customer: customers){
            if(customer.getCreditCardNumber().compareTo(min)>= 0 && customer.getCreditCardNumber().compareTo(max)<=0){
                customersName.add(customer);
            }
        }
        return customersName.toArray(Customer[]::new);
    }

    public static Customer[] getAllByDebt(Customer[] customers){
        List<Customer> customersName = new ArrayList<>();
        for(Customer customer: customers){
            if(customer.getBalance()<0){
                customersName.add(customer);
            }
        }
        return customersName.toArray(Customer[]::new);
    }

    private static String customersToString(Customer[] customers){
        StringBuilder sb = new StringBuilder();
        for(Customer customer: customers){
            sb.append(customer.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}

