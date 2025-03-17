package com.leonardof108.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setAccountNumber(123456789);
        bank.setBalance(1000);
        bank.setCustomerName("Leonardo");
        bank.setEmail("leonardof108@gmail.com");
        bank.setPhoneNumber("123456789");

        bank.depositFunds(500);
        bank.withdrawFunds(2000);

    }
}
