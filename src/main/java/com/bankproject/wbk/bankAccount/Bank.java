package com.bankproject.wbk.bankAccount;

import java.math.BigDecimal;

public class Bank {

    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Account createNewAccount(String customersName, BigDecimal startingBalance) {
        return new Account (customersName, startingBalance);
    }

    public void displayTotalAccountsCreated () {
        System.out.println(bankName + ": " + "Total Accounts created: " + Account.getAccountCounter());
    }
}
