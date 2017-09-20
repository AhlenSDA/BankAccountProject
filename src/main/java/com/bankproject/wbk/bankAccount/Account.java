package com.bankproject.wbk.bankAccount;

import java.math.BigDecimal;

public class Account {

    private String customerName;
    private BigDecimal balance;
    private static int accountCounter = 0;
    private int accountID;

    Account(String accountOwnerName, BigDecimal accountStartingBalance) {
        this.customerName = accountOwnerName;
        this.balance = accountStartingBalance;
        accountCounter++;
        this.accountID = accountCounter;

        // account_ID++ and accountCounter
        // Each time new account object is created, it's personal id number is assigned while accountCounter increments.
        // Those fields are meant to differ accounts from each other by unique number and also count their total amount at the same time.
    }

    private int getAccountID() {
        return accountID;
    }

    static int getAccountCounter() {
        return accountCounter;
    }

    public void depositMoney(BigDecimal amount) {
        displayAccountOwnerAndID();
        balance = balance.add(amount);
        System.out.println("Amount deposited: " + amount + "\n");
    }

    public void withdrawMoney(BigDecimal amount) {
        displayAccountOwnerAndID();
        balance = balance.subtract(amount);
        System.out.println("Amount withdrawn: " + amount + "\n");
    }

    public void showCurrentAccountBalance() {
        displayAccountOwnerAndID();
        System.out.println("Account balance: " + balance + "\n");
    }

    private void displayAccountOwnerAndID() {
        System.out.println("Account ID: " + getAccountID() + "\n" + customerName.toUpperCase());
    }


}
