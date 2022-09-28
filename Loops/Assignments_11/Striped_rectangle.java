import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        int sec=s.nextInt();
        
        
        for (long i=1;i<=num;i++){
            if (i%2!=0){
                System.out.print(("+ ").repeat(sec));
            }else{
                System.out.print(("- ").repeat(sec));
            } 
            System.out.println();
        }
       
        }
        
    }
