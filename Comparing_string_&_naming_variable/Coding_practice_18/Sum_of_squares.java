import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n=s.nextInt();
        long square = 0;
        for (long i =1;i<=n;i++){
            square+=(i*i);
            
        }
        System.out.println(square);
    }
}
