import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        long i=1,n;
        while(i<=num){
            n=s.nextLong();
            System.out.println(n);
            i=i+1;
        }
    }
}
