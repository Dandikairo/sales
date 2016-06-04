
package com.adrotltd.sales;

/**
 *
 * @author Okello
 */
public class Customer {
    private String number;
    private String name;
    private String address;
    private String currency;
    private double balance;

    public String getAddress() {
        return address;
    }


    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public String getNumber() {
        return number;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }
    
    
}
