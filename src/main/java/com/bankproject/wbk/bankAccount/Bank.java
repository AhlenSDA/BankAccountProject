package com.bankproject.wbk.bankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Account> bankAccountList = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Account createNewAccount(String customersName, BigDecimal startingBalance) {
        Account newAccount = new Account(customersName, startingBalance);
        bankAccountList.add(newAccount);
        return newAccount;
    }

    public void printArrayOfBankAccounts() {
        System.out.println("\n" + bankName + " (" + bankAccountList.size() + ")");
        for (Account account : bankAccountList) {
            System.out.println(account.toString());
        }
    }

    public void accountsCreatedInBank() {
        System.out.println("Accounts in bank: " + bankAccountList.size());
    }
}

