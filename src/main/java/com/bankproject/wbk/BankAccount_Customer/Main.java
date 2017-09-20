package com.bankproject.wbk.BankAccount_Customer;

import com.bankproject.wbk.bankAccount.Account;
import com.bankproject.wbk.bankAccount.Bank;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Bank wbk = new Bank("WBK");
        Account wbkMarcinKroszel = wbk.createNewAccount("Marcin Kroszel", BigDecimal.valueOf(500));
        Account wbkKatarzynaKroszel = wbk.createNewAccount("Katarzyna Kroszel", BigDecimal.valueOf(700));
        Account wbkAlicjaKroszel = wbk.createNewAccount("Alicja Kroszel", BigDecimal.valueOf(2000));

        wbkMarcinKroszel.showCurrentAccountBalance();
        wbkKatarzynaKroszel.showCurrentAccountBalance();
        wbkAlicjaKroszel.showCurrentAccountBalance();
        wbk.displayTotalAccountsCreated();

        Bank mBank = new Bank("MBank");
        Account mBankMarcinKroszel = mBank.createNewAccount("Marcin Kroszel", BigDecimal.valueOf(1000));

        mBank.displayTotalAccountsCreated();
        mBankMarcinKroszel.showCurrentAccountBalance();
        mBankMarcinKroszel.withdrawMoney(BigDecimal.valueOf(1000));
        mBankMarcinKroszel.showCurrentAccountBalance();
        mBankMarcinKroszel.depositMoney(BigDecimal.valueOf(1));
        mBankMarcinKroszel.showCurrentAccountBalance();
    }
}
