import java.util.Scanner;
import java.math.BigInteger;
class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int m= s.nextInt();
        String ad= "";
        BigInteger sum = BigInteger.ZERO;
        for (long i=1L;i<=m;i++){
            ad+="2";
            BigInteger res = new BigInteger(ad);
            sum=sum.add(res);
        }
        System.out.print(sum);
    }
}
