import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        
        long sum =1,i=1;
        while(i<=num){
            
            sum=sum*i;
            
            i=i+1;
        }
        System.out.println(sum);
    }
}
