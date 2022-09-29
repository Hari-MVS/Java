import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            if (i==1 || i==n){
                System.out.println("* ".repeat(n));
            }else{
                System.out.println("* ".repeat(1)+"  ".repeat(n-2)+"* ".repeat(1));
            }
        }
        for(int i=1;i<n;i++){
            if (i==n-1){
                System.out.println("* ".repeat(n));
            }else{
                System.out.println("  ".repeat(n-1)+"* ".repeat(1));
            }
        }
    }
}
