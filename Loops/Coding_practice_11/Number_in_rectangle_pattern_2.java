import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sec = s.nextInt();
        
        
        for (int i=1;i<=num;i++){
            
            System.out.print((i+" ").repeat(sec));
                
                 
            System.out.println();
            }
       
        }
        
    }
