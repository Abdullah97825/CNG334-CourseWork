/*
* Abdullah Sulayfani
* 2246304
* Individual course work
*/


//Main class
public class BankingApp {
    public static void main (String[] args){

        double Balance;
        int AccountNumber, amount;
        String owner, firstName, surname;

        Methods functions = new Methods();

        /* Since no network programming is allowed, we can't receive the values from the client */

        /* To do:
         * Establish connection with client here
         * Get data from client here
         *
         */


        /* Hard coded test data */
        Balance = 50;
        AccountNumber = 2347315;
        owner = "John Keeth";
        firstName = "John";
        surname = "Keeth";

        /* User and user bank account instantiation */
        BankAccount bankAccount = new BankAccount(AccountNumber, Balance, owner);
        User userAccount1 = new User(firstName, surname, bankAccount);


        /* Based on the client request, will deposit or withdraw money */

        //test value for amount, will be recieved from the client
        amount = 50;

        //Threads will be implemented instead of "functions" in the future
        functions.deposit(amount, userAccount1);
        functions.withdraw(amount, userAccount1);


    }

}



