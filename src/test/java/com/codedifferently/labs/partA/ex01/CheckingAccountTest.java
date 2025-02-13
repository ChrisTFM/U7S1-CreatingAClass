package com.codedifferently.labs.partA.ex01;

import partA.ex01.CheckingAccount;

public class CheckingAccountTest {
    public static void main(String[] args) {
        CheckingAccount user1 = new CheckingAccount();
        user1.balance = 231.0;
        user1.name ="John";

        System.out.println(user1.balance);

        user1.deposit(212.2);

        System.out.println(user1.balance);
        System.out.println(user1.name);
    }
}
