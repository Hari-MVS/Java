import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int m = s.nextInt();
        for (int i =1;i<=m;i++){
            for (int j =1;j<=m;j++){
                if (i==1 || j==1 || j==m ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i =0;i<=m;i++){
            for (int j =1;j<=m;j++){
                if (i==0 || j==1 || j==m || i==m){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
