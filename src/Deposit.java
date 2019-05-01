
public class Deposit extends Thread {

    private double amount;
    private User userAccount;

    public Deposit(double amount, User userAccount){

        this.amount = amount;
        this.userAccount = userAccount;

        start();
    }

    public void run(){
        userAccount.deposit(amount);
    }

}
