package com.bankproject.wbk.bankAccount;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    private String bankName;
    private ArrayList<Account> bankAccountList = new ArrayList<Account>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Account createNewAccount(String customersName, BigDecimal startingBalance) {
        Account newAccount = new Account(customersName, startingBalance);
        bankAccountList.add(newAccount);
        return newAccount;
    }

    public void printArrayOfBankAccounts() {
        System.out.println("\n" + this.bankName);
        for (Account account : bankAccountList) {
            System.out.println(account.toString());
        }
    }

    public void accountsCreatedInBank () {
        System.out.println("Total accounts created: " + bankAccountList.size());
    }

    public void listMethodTest () {
        System.out.println(Arrays.toString(bankAccountList.toArray()));
    }
}

