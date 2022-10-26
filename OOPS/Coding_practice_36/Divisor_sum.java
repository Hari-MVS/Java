import java.util.Scanner;

/**
*
* Implement AdvancedArithmetic interface and MyCalculator class accordingly.
*
*/
interface AdvancedArithmetic{
    int divisorSum(int sum);
}
class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int sum){
        int re=0;
        for (int i =1;i<=sum;i++){
            if (sum%i==0){
                re+=i;
            }
        }
        return re;
    }
} 

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyCalculator myCalculator = new MyCalculator();
        int divisorSum = myCalculator.divisorSum(input.nextInt()); // takes 6 as input and returns 12
        System.out.println(divisorSum);
        input.close();
    }
}
