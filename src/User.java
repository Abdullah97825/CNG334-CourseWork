import java.util.ArrayList;

public class User {

    private String FirstName;
    private String Surname;
    private BankAccount bankAccount;
    private ArrayList<Double> transactionList  = new ArrayList<Double>(0);

    //Integer that will be used for calculations (temp value holder)
    private double temp = 0;


    public User(String firstName, String surname, BankAccount bankAccount){

        this.FirstName = firstName;
        this.Surname   = surname;
        this.bankAccount= bankAccount;

    }

    //****************Getters****************//
    public String getFirstName() {return FirstName; }

    public String getSurname() { return Surname; }

    public BankAccount getBankAccount() { return bankAccount; }

    public ArrayList<Double> getTransactionList() { return transactionList;}


    //****************Setters*****************//
    public void setFirstName(String firstName) {this.FirstName = firstName;}

    public void setSurname(String surname) {this.Surname = surname;}

    public void setBankAccount(BankAccount bankAccount) {this.bankAccount = bankAccount;}

    public void setTransactionList(ArrayList<Double> transactionList){this.transactionList = transactionList;}


    //**************Methods*************//
    //Function that will deduct "amount" from Balance
    public void withdraw(int amount)
    {
        temp = bankAccount.getBalance();

        if((temp - amount) < 0)
            printMessage("Error, Balance not enough.");
        else {
            bankAccount.setBalance((temp - amount));
            newTransaction(amount * -1);
        }
    }

    //Function that will add "amount" to Balance
    public void deposit(int amount)
    {
        temp = bankAccount.getBalance();
        temp += amount;
        bankAccount.setBalance(temp);
        newTransaction(amount);
    }

    //Function to add the new deducted/deposited amount to the transactions list
    void newTransaction(double amount)
    {
        this.transactionList.add(amount);
    }

    //Helper function to print messages
    void printMessage(String message)
    {
        System.out.println(message);
    }


}
