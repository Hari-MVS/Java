import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Long num = s.nextLong();
        
        long sum =0,i=num;
        while(i>0){
            
            sum=sum+(i%10);
            
            i=i/10;
        }
        System.out.println(sum);

    }
}
