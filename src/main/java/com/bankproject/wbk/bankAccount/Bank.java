package com.bankproject.wbk.bankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Account> bankAccountList = new ArrayList<Account>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Account createNewAccount(String customersName, BigDecimal startingBalance) {
        bankAccountList.add(new Account(customersName, startingBalance));
        return new Account(customersName, startingBalance);
    }

    public void displayTotalAccountsCreated() {
        System.out.println(bankName + ": " + "Total Accounts created: " + Account.getAccountCounter() + "\n");
    }

    public void printArrayOfBankAccounts() {
        System.out.println(this.bankName);
        for (Account account : bankAccountList) {
            System.out.println(account.toString());
        }
    }
}

