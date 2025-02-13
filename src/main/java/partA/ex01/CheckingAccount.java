package partA.ex01;

public class CheckingAccount {
    public String name;
    public Double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public static void main(String[] args){
        CheckingAccount user1 = new CheckingAccount();
        user1.balance = 231.0;
        user1.name = "John";

        System.out.println(user1.balance);

        user1.deposit(212.2);

        System.out.println(user1.balance);
        System.out.println(user1.name);
    }
}

