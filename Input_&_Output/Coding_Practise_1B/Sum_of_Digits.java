import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        
        
        System.out.println((p/100)+((p/10)%10)+(p%10));
    }
}
