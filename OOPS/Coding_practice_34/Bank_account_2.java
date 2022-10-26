import java.util.Scanner;

/**
* A BankAccount class should have the following attributes and methods
* Attributes
* - balance (float)
*   Initially the bank account should contain zero balance.
* 
* Methods
*  - deposit
*    It takes amount (float) as a argument.
*    When this method is called, the amount should be added to the current balance in the account.
*  - withdraw
*    It takes amount (float) as a argument
*    When this method is called,  if the amount passed is greater than the balance print "Insufficient balance".
*    Else the amount should be deducted from the current balance.
*  - getBalance
*    This method should return the current balance in the account.
*
* A SavingsAccount class should have the following attributes and methods
* Attributes
*  -  interestRate (float)
*     It should be a static attribute with value 3.5f (Since it won't change across instances)
*
* Methods
*  -  getInterest
*     This method should return the interestRate.
*
*/


class BankAccount {
   float balance=0.0f;
   
   float getBalance(){
       return balance;
   }
   void deposit(int amount){
       balance+=amount;
   }
   void withdraw(int amount){
       if (amount>balance){
           System.out.println("Insufficient balance");
       }else{
           balance-=amount;
       }
   }
}

class SavingsAccount extends BankAccount{
   static float interestRate=3.5f;
   
   public float getInterestRate(){
       return interestRate;
   }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingsAccount account1 = new SavingsAccount();
        System.out.println(account1.getBalance()); // Should print the current account balance => 0.0
        account1.deposit(input.nextInt()); // Amount (500) should be deposited in account 1
        System.out.println(account1.getBalance()); // Should print the current account balance => 500.0
        account1.withdraw(input.nextInt()); // Amount (200) should be withdrawn from account 1
        System.out.println(account1.getBalance()); // Should print the current account balance => 300.0
        account1.deposit(input.nextInt()); // Amount (100) should be deposited in account 1
        System.out.println(account1.getBalance()); // Should print the current account balance => 400.0
        account1.withdraw(input.nextInt()); // Amount (1000) Should print "Insufficient balance"
        System.out.println(account1.getBalance()); // Should print the current account balance => 400.0
        System.out.println(account1.getInterestRate()); // Should print the interestrateRate applied => 3.5
    }
}
