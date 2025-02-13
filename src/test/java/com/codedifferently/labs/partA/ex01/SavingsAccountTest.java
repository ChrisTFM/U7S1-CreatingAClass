package com.codedifferently.labs.partA.ex01;

import org.junit.jupiter.api.Test;
import partA.ex01.SavingAccountExample;

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingAccountExample sa0001 = new SavingAccountExample();
        sa0001.name = "Damien";
        sa0001.interestRate = 0.02;
        sa0001.deposit(1000);
        System.out.println(sa0001.balance);

        SavingAccountExample sa0002 = new SavingAccountExample();
        sa0002.balance = 2000;
        sa0002.name = "Hakim";
        sa0002.interestRate = 0.02;

    }
}
