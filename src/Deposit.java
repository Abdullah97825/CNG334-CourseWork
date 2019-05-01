//Thread that will be responsible for calling Deposit function in User
public class Deposit extends Thread {

    private double amount;
    private User userAccount;

    public Deposit(double amount, User userAccount){

        this.amount = amount;
        this.userAccount = userAccount;

        //Start the thread
        start();
    }

    public void run(){
        userAccount.deposit(amount);
        System.out.println("Successfully deposited.");
    }

}
