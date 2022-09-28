import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        long count=0;
        
        
        for (long i=2;i<=num;i++){
            if (num%i==0 ){
                count+=1;
            } 
        }
        if (count>1){
            System.out.println("True");
        }else {
            System.out.println("False");
        }  
    }
