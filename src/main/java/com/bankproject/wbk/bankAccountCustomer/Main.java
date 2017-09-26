package com.bankproject.wbk.bankAccountCustomer;

import com.bankproject.wbk.bankAccount.Account;
import com.bankproject.wbk.bankAccount.Bank;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Bank wbk = new Bank("WBK");
        Account wbkMarcinKroszel = wbk.createNewAccount("Marcin Kroszel", BigDecimal.valueOf(500));
        Account wbkKatarzynaKroszel = wbk.createNewAccount("Katarzyna Kroszel", BigDecimal.valueOf(700));
        Account wbkAlicjaKroszel = wbk.createNewAccount("Alicja Kroszel", BigDecimal.valueOf(2000.999));
        wbk.printArrayOfBankAccounts();

        Bank mBank = new Bank("mBank");
        Account mBankMalgorzataDymek = mBank.createNewAccount("Małgorzata Dymek", BigDecimal.valueOf(-500.01));
        Account mBankDawidKata = mBank.createNewAccount("Dawid Kata", BigDecimal.valueOf(1999.99));
        Account mBankMartaKata = mBank.createNewAccount("Marta Kata", BigDecimal.valueOf(1999.999));
        Account mBankStanislawKata = mBank.createNewAccount("Stanislaw Kata", BigDecimal.valueOf(1999.9999));
        mBank.printArrayOfBankAccounts();

        Bank alior = new Bank("Alior Bank");
        Account aliorAgnieszkaDrozdowska = alior.createNewAccount("Agnieszka Drozdowska", BigDecimal.valueOf(9500000.135));
        Account aliorStanislawDrozdowski = alior.createNewAccount("Stanislaw Drozdowski", BigDecimal.valueOf(.456789));
        alior.printArrayOfBankAccounts();

        System.out.println("\n---------------------------------");
        System.out.println("TESTING MONEY TRANSFER METHOD");

        wbkMarcinKroszel.transferMoney(wbkMarcinKroszel, wbkKatarzynaKroszel, BigDecimal.valueOf(600));
        wbkMarcinKroszel.showCurrentAccountBalance();
        wbkKatarzynaKroszel.showCurrentAccountBalance();

        wbk.printArrayOfBankAccounts();

    }
}
