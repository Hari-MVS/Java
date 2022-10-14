import java.util.*;
class Main {

    static String fizzbuzz(int num) {

        if (num%3==0 && num%5==0){
            return "FizzBuzz";
        }else if(num%5==0){
            return "Buzz";
        }else if (num%3==0){
            return "Fizz";
        }else{
            return String.valueOf(num);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        System.out.println(fizzbuzz(temp));

        sc.close();
    }

}
