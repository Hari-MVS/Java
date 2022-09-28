import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        long res = 0;
        
        
        for (long i=1;i<=num;i++){
            if (i%2!=0){
                res+=i;
            } 
            }
        System.out.println(res);
       
        }
        
    }
