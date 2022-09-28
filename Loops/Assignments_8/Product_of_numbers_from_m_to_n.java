import java.util.Scanner;
import java.math.BigInteger;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sec = s.nextInt();
        long i=num;
        BigInteger sum = BigInteger.ONE;
        while(i<=sec){
            BigInteger temp = BigInteger.valueOf(i);
            sum=sum.multiply(temp);
            
            i=i+1;
        }
        System.out.println(sum);
    }
}
