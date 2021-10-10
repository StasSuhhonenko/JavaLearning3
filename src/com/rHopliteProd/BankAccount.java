package com.rHopliteProd;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    Scanner input = new Scanner(System.in);


    public String getAccountNumber() {
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
        System.out.println(getCustomerName() + ", How many euros do you want to add to account " + getAccountNumber() + " ?");
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
        if(balance - withdrewMoney > 0){
            balance -= withdrewMoney;
            System.out.println("You've withdrew " + withdrewMoney + " euros from your account");
            System.out.println("The balance now is " + balance + " euros");
        } else {
            System.out.println("Insufficient money");
        }

    }

}
