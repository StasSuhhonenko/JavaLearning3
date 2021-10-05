package com.rHopliteProd;

import java.util.Scanner;

public class BankAccount {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    Scanner input = new Scanner(System.in);

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public double getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(){
        System.out.println("How many euros do you want to add to your account?");
        double depositedAmount = input.nextDouble();
        input.nextLine();
        balance += depositedAmount;
        System.out.println("You've added " + depositedAmount + " euros to your account");
        System.out.println("The balance now is " + balance + " euros");
    }
    public void withdrawal(){
        System.out.println("How many euros do you want to withdraw?");
        double withdrewMoney = input.nextDouble();
        input.nextLine();
        balance -= withdrewMoney;
        System.out.println("You've withdrew " + withdrewMoney + " euros from your account");
        System.out.println("The balance now is " + balance + " euros");
    }
}
