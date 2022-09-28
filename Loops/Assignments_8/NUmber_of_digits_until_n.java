import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        
        long count=0,i;
        for (i=1;i<=num;i*=10){
            count+=(num-i+1);
        }
        
        System.out.println(count);
    }
}
