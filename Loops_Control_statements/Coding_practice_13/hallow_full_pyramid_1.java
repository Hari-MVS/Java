import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        for (int i =1;i<=m;i++){
                System.out.print(" ".repeat(m-i));
            for (int j =1;j<=i;j++){
                if ( j==1 ){
                    System.out.print("* ");
                }else if(j==i || i==m ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                    
                }
                
            }
            System.out.println();
        }
    }
}
