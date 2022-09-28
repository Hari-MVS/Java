import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        
        long sum =0,i=1;
        while(i<=10){
            long num = s.nextLong();
            sum=sum+num;
            
            i=i+1;
        }
        System.out.println(sum);
        System.out.println((float)sum/10);
    }
}
