package com.bankproject.wbk.bankAccountCustomer;

import com.bankproject.wbk.bankAccount.Account;
import com.bankproject.wbk.bankAccount.Bank;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Bank wbk = new Bank("WBK");

        Account wbkMarcinKroszel = wbk.createNewAccount("Marcin Kroszel", BigDecimal.valueOf(500));
        Account wbkKatarzynaKroszel = wbk.createNewAccount("Katarzyna Kroszel", BigDecimal.valueOf(700));
        Account wbkAlicjaKroszel = wbk.createNewAccount("Alicja Kroszel", BigDecimal.valueOf(2000));
        wbk.printArrayOfBankAccounts();
        wbk.displayTotalAccountsCreated();

        Bank mBank = new Bank("mBank");
        Account mBankJanKowalski = mBank.createNewAccount("Małgorzata Dymek", BigDecimal.valueOf(-500));
        mBank.printArrayOfBankAccounts();
        mBank.displayTotalAccountsCreated();

        Bank alior = new Bank("Alior Bank");
        Account aliorAgnieszkaDrozdowska = alior.createNewAccount("Agnieszka Drozdowska", BigDecimal.valueOf(5000));
        Account aliorStanislawDrozdowski = alior.createNewAccount("Stanislaw Drozdowski", BigDecimal.valueOf(1000));
        alior.printArrayOfBankAccounts();
        alior.displayTotalAccountsCreated();
    }
}
