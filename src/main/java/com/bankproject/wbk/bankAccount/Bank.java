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
        bankAccountList.add(new Account(customersName, startingBalance));
        return new Account(customersName, startingBalance);
    }

    public void printArrayOfBankAccounts() {
        System.out.println("\n" + this.bankName);
        for (Account account : bankAccountList) {
            System.out.println(account.toString());
        }
    }

    public void accountsCreatedInBank () {
        System.out.println("Total customers accounts created: " + bankAccountList.size());
    }

    public void listMethodTest () {
        System.out.println(Arrays.toString(bankAccountList.toArray()));
    }
}

