package com.codedifferently.labs.partA.ex02;

import partA.ex02.SavingBond;

public class SavingBondTest {
    public static void main(String[] args){
        SavingBond account = new SavingBond();
        account.name = "Jimmy";
        account.balance = 152.6;
        account.term = 60;
        account.monthLeft = 0;
        account.interest = account.setInterest();

        //Before stuff
        System.out.println("Before");
        System.out.println(account.name);
        System.out.println(account.balance);
        System.out.println(account.term);
        System.out.println(account.monthLeft);
        System.out.println(account.interest);

        if (account.monthLeft == 0) {

        }
        account.balance += account.earnInterest();

        //After stuff
        System.out.println("\nAfter");
        System.out.println(account.name);
        System.out.println(account.balance);
        System.out.println(account.term);
        System.out.println(account.monthLeft);
        System.out.println(account.interest);

    }
}
