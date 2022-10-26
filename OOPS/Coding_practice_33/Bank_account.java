import java.util.Scanner;

/**
 *
 * A Account class should consists of a constructor 
 *     - It should accept a single parameter name of the customer which is of string datatype
 *
 * Account class should have the following attributes
 * 
 * Attributes
 * name (String), accNo (long), email (String), amount (float) 
 *
 * Among the given attributes accNo, email, amount should be declared as private attributes
 *
 * Implement the getter and setter methods accordingly to access and update these private attributes
 *
 * Setter and Getter Methods
 * setAccNo(), getAccNo(), setEmail(), getEmail(), setAmount(), getAmount()
 *
 * Implement the Account class appropriately
 */

class Account {
   String name; 
   private long accNo ;
   private String email;
   private float amount ; 
   Account(String name){
       this.name=name;
   }
   public long getAccNo(){
       return accNo;
   }
   public String getEmail(){
       return email;
   }
   public float getAmount(){
       return amount;
   }
   public void setAccNo(long accNo){
       this.accNo=accNo;
   }
   public void setEmail(String email){
       this.email=email;
   }
   public void setAmount(float amount){
       this.amount=amount;
   }
   
}

/**
* You need not change any code below.
*/

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        Account account = new Account(name);
        System.out.println(account.name); // Should print the name passed to the constructor => Paul
        account.setAccNo(input.nextLong()); // Should set the account number for the first time
        System.out.println(account.getAccNo()); // Should print the account number => 63742211
        account.setEmail(input.next()); // Should set the email id for the first time
        System.out.println(account.getEmail()); // Should print the email id => xyz@gmail.com
        account.setAmount(input.nextFloat()); //Should set the amount for the first time
        System.out.println(account.getAmount()); // Should print the amount => 10000.0
        input.close();
    } 
}
