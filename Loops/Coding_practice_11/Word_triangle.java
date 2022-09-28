import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        
        for (int i=0;i<num.length();i++){
            for (int j=0;j<=i;j++){
                System.out.print(num.charAt(j));
              }   
            System.out.println();
            }
       
        }
        
    }
