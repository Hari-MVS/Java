import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int med =(2*m)-1;
        System.out.print("* ".repeat(med));
        System.out.println();
        for (int i=1;i<m;i++){
            System.out.print(" ".repeat(i)+"* ".repeat(m-i)+"  ".repeat(i-1)+"* ".repeat(m-i));
            System.out.println();
            
            
        }
        
    }
}
