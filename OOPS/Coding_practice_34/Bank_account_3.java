import java.util.Scanner;

/**
 * A CurrentAccount should have the following attributes and methods
 * Attributes
 * - freeTransactions (int)
 *   It's a static attribute with the value 3
 * - transactionFee (float)
 *   It's a static attribute with the value 20f
 * - transactionCount (int)
 *   It's a non-static attribute with the value 0
 *
 * Methods
 * - deductFee
 *   Calculate the fee to be deducted 
 *   If the balance is greater than fee deduct the fee from the balance
 *   Else print the message "Insufficient balance"
 * - deposit
 *   It takes amount (float) as a argument      
 *   When this method is called, increase the transactionCount
 *   If the transactionCount is less than freeTransactions deposit the amount 
 *   Else first deduct the fees and then deposit the amount
 * - withdraw
 *   It takes amount (float) as a argument
 *   When this method is called, increase the transactionCount
 *   If the transactionCount is less than freeTransactions withdraw the amount 
 *   Else first deduct the fees and then withdraw the amount
 */


class BankAccount {
    float balance =0.0f;
    
    float getBalance(){
        
        return balance;
        
    }
}

class CurrentAccount extends BankAccount{
    static int freeTransactions =3;
    static float transactionFee=20f;
    int transactionCount=0;
    
    void deductFee(){
        float fee=transactionFee * (transactionCount - freeTransactions);
        if (balance> fee){
            balance-=fee;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    
    void deposit(int amount){
        transactionCount+=1;
        if (transactionCount<freeTransactions){
            balance+=amount;
        }else{
            deductFee();
            balance+=amount;
        }
        
    }
    void withdraw(int amount){
        transactionCount+=1;
        if (transactionCount<freeTransactions){
            if (balance>amount){
                balance-=amount;
            }else{
                System.out.println("Insufficient balance");
            }
        }else{
            deductFee();
            if (balance>amount){
                balance-=amount;
            }else{
                System.out.println("Insufficient balance");
            }
        }
        
    }
}
   


class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CurrentAccount account1 = new CurrentAccount();
        System.out.println(account1.getBalance()); // Should print the current account balance => 0.0
        account1.deposit(input.nextInt()); // Amount (1000) should be deposited in account 1
        System.out.println(account1.getBalance()); // Should print the current account balance => 1000.0
        account1.withdraw(input.nextInt()); // Amount (500) should be withdrawn from account 1
        System.out.println(account1.getBalance()); // Should print the current account balance => 500.0
        account1.deposit(input.nextInt()); // Amount (2000) should be deposited in account 1
        System.out.println(account1.getBalance()); // Should print the current account balance => 2500.0
        account1.withdraw(input.nextInt()); // Along with amount (1000) withdrawn additional fees will be deducted
        System.out.println(account1.getBalance()); // Should print the current account balance => 1480.0
        account1.withdraw(input.nextInt()); // Along with amount (1000) withdrawn additional fees will be deducted
        System.out.println(account1.getBalance()); // Should print the current account balance => 440.0
    }
}
