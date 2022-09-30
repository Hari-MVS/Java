import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        long sec = s.nextLong();
        long count=0;
        
        
        for (long i=num;i<=sec;i++){
            count=0;
            for (long j=2;j<=sec;j++){
                if (i%j==0 ){
                    count+=1;
                } 
            }
            if (count>1){
                System.out.println(i);
            }  
        }
        
    }
}
