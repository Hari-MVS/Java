import java.util.Scanner;

/**
* Interface Addition should have the following abstract method.
* 
* Abstract Method
* - add
* 
* Interface Subtraction should have the following abstract methods.
* 
* Abstract Method
* - subtract
*
* Interface Multiplication should have the following abstract methods.
* - multiply
*
* Class Calculator should implement all the above interfaces
* It should have the following methods
* 
* Methods
* - add
*   Takes two integers as input and return their sum
* - subtract 
*   Take two integers as input and return their difference
* - multiply
*   Take two integers as input and return their product
* 
* Implement the interfaces and classes accordingly 
*/


interface Addition {
    int add(int a,int b);
}

interface Subtraction {
    int subtract(int a,int b);
}
interface Multiplication {
    int multiply(int a,int b);
}

class Calculator implements Addition,Subtraction,Multiplication {
   public int add(int a,int b){
       return a+b;
   }
   public int subtract(int a,int b){
       return a-b;
   }
   public int multiply(int a,int b){
       return a*b;
   }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(input.nextInt(), input.nextInt())); // takes 2, 3 as input and returns 5
        System.out.println(calculator.subtract(input.nextInt(), input.nextInt())); // takes 5, 4 as input and returns 1
        System.out.println(calculator.multiply(input.nextInt(), input.nextInt())); // takes 6, 7 as input and returns 42
        input.close();
    }
}
