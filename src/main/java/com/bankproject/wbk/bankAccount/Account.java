package com.bankproject.wbk.bankAccount;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class Account {

    private String customerName;
    private BigDecimal balance;
    private final int ACCOUNT_ID; // how to make bank's accounts to have separate ID number? Does it even make sense?
    private static AtomicInteger nextId = new AtomicInteger();

    Account(String accountOwnerName, BigDecimal accountStartingBalance) {
        this.customerName = accountOwnerName;
        this.balance = accountStartingBalance;
        this.ACCOUNT_ID = nextId.incrementAndGet();
    }

    public void depositMoney(BigDecimal amount) {
        balance = balance.add(amount);
        System.out.println("Amount deposited: " + amount + "\n");
    }

    public void withdrawMoney(BigDecimal amount) {
        balance = balance.subtract(amount);
        System.out.println("Amount withdrawn: " + amount + "\n");
    }

    public void showCurrentAccountBalance() {
        System.out.println(customerName + ", balance: " + balance);
    }

    // need to fix if statement (negative amount of money can be transferred atm)
    public void transferMoney (Account transferringAccount, Account receivingAccount, BigDecimal moneyToTransfer) {
        if (moneyToTransfer.compareTo(BigDecimal.ZERO) >= transferringAccount.balance.compareTo(BigDecimal.ZERO)) {
            transferringAccount.balance = transferringAccount.balance.subtract(moneyToTransfer);
            receivingAccount.balance = receivingAccount.balance.add(moneyToTransfer);
        } else
            System.out.println("ERROR");
    }

// Default working toString method
//    @Override
//    public String toString() {
//        return "Account {" +
//                "customerName = '" + customerName + '\'' +
//                ", ACCOUNT_ID = " + ACCOUNT_ID +
//                ", balance = " + currencyFormat(balance) +
//                '}';
//    }

// Customized_1 toString method
//    @Override
//    public String toString() {
//        return "Account ID " + ACCOUNT_ID +
//                ", " + customerName +
//                ", balance = " + currencyFormat(balance);
//    }

    // Customized_2 toString method
    @Override
    public String toString() {
        return String.format("Account ID %-8d %-23s balance: %-20s", ACCOUNT_ID, customerName, currencyFormat(balance));
    }

    private String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
