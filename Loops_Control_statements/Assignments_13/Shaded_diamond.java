import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        for (int i =1;i<=m;i++){
                System.out.print(" ".repeat(m-i));
            for (int j =1;j<=i;j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
        for (int i =2;i<=m;i++){
                System.out.print(" ".repeat(i-1));
            for (int j =1;j<=m;j++){
                if ( i==1 || j==1){
                    System.out.print("* ");
                }else if(j==m-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                    
                }
                
            }
            System.out.println();
        }
    }
}
