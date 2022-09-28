import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        long i=1,sum=1;
        while(i<=num){
            long n =s.nextLong();
            sum*=n;
            i=i+1;
        }
        System.out.println(sum);
    }
}
