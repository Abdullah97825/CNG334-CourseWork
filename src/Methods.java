//Since Threads are not allowed at this stage, normal functions were used, "Methods" is the class that will be used
//to call the instance methods
class Methods{


    //Function that the server will use to deposit money in an account
    public void deposit(int amount, User userAccount)
    {
        userAccount.deposit(amount);
        printMessage("Successfully deposited.");
    }


    //Function that server will use to withdraw money in an account
    public void withdraw(int amount, User userAccount)
    {
        double temp;
        BankAccount bankAccount = userAccount.getBankAccount();
        temp = bankAccount.getBalance();

        if((temp - amount) < 0)
            printMessage("Error, Balance not enough.");
        else
            userAccount.withdraw(amount);

        printMessage("Successfully withdrew.");

    }

    //Helper function to print messages
    void printMessage(String message)
    {
        System.out.println(message);
    }
}