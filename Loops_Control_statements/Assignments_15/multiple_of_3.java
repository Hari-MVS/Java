import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        
        for (long i=1;i<=num;i++){
            long sec = s.nextLong();
             if (sec%3==0){
                 System.out.println(sec);
             }
        }
        
    }
}
