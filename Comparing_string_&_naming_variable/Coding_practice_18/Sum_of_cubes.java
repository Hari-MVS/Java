import java.math.BigInteger;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n=s.nextLong();
        BigInteger square = BigInteger.ZERO;
        for (long i =1;i<=n;i++){
            square=square.add(BigInteger.valueOf(i*i*i));
            
        }
        System.out.println(square);
    }
}
