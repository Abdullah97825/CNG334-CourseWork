//Thread that will be responsible for calling withdraw function in User
public class Withdraw extends Thread {

    private double amount;
    private User userAccount;

    public Withdraw(double amount, User userAccount){

        this.amount = amount;
        this.userAccount = userAccount;

        //Start the thread
        start();
    }

    public void run(){
            userAccount.withdraw(amount);
    }

}