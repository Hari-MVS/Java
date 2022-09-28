import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        for (int i =1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(m+" ");
                m=m+1;
            }
            System.out.println();
        }
    }
}
