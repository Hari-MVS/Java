import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        for (int i = 0;i < num; i++){
            
            for(int j=2*((num-i)-1); j >0; j--){
                System.out.print(" ");
            }
            
            for (int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 
