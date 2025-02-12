package partA.ex02;

public class SavingBond {
    /*
    A person may purchase a bond for any term between 1 and 60 months
    A bond earns interest every month until its term matures (0 months remaining)
    The term and interest rate are set at the same time
    The bond's interest rate is based on its term according to the following tier system.
    */
    public String name;
    public double balance, interest;
    public int term, monthLeft;

    public double setInterest(){
        if (term <= 60 && term >= 48){
            return 2.5;
        }
        else if (term <= 47 && term >= 36){
            return 2.0;
        }
        else if (term <= 35 && term >= 24){
            return 1.5;
        }
        else if (term <= 23 && term >= 12){
            return 1.5;
        }
        return 0.5;
    }
    public double earnInterest(){
        return balance * interest / 12;
    }
    public void mature(){

    }

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
