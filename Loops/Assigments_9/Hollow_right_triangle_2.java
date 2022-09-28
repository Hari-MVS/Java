import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int m= s.nextInt();
        for (int i=1;i<=m;i++){
            for (int j=1;j<=m;j++){
                if (i==m || j==(m-i+1) || j==m){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
}
