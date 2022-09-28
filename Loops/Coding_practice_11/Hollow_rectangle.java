import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sec = s.nextInt();
        
        for (int i=1;i<=num;i++){
            for (int j=1;j<=sec;j++){
                if (i==1 || i==num || j==1 || j==sec) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
              }   
            System.out.println();
            }
       
        }
        
    }
