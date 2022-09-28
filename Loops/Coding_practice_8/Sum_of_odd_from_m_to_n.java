import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        long sec = s.nextLong();
        
        long sum =0,i=num;
        while(i<=sec){
            if (i%2!=0){
                sum=sum+i;
            }
            i=i+1;
        }
        System.out.println(sum);
    }
}
