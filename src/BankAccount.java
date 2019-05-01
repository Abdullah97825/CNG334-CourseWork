
//Class that will manage storing and modifying account information
public class BankAccount {
    private double Balance;
    private int AccountNumber;
    private String owner;

    public BankAccount(int accountNumber, double balance, String name) {
        this.AccountNumber = accountNumber;
        this.Balance       = balance;
        this.owner         = name;
        System.out.println("Logged in account");
    }

    //Constructor
    public void BankAccount() {
        System.out.println("Logged in account");
    }



    //Setters
    public void setBalance(double balance)
    {
        this.Balance = balance;
    }

    public void setAccountNumber(int number)
    {
        this.AccountNumber = number;
    }

    public void setOwner(String name)
    {
        this.owner = name;
    }


    //Getters
    public double getBalance()
    {
        return Balance;
    }

    public int getAccountNumber()
    {
        return AccountNumber;
    }

    public String getOwner()
    {
        return owner;
    }



}
