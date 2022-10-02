import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n=64;
        for (int i =1;i<=m;i++){
                System.out.print(" ".repeat(m-i));
                n+=1;
            for (int j =1;j<=i;j++){
                if ( j==1 ){
                    System.out.print((char)n+" ");
                }else if(j==i ){
                    System.out.print((char)n+" ");
                }else{
                    System.out.print("  ");
                    
                }
                
            }
            System.out.println();
        }
         for (int i =2;i<=m;i++){
                System.out.print(" ".repeat(i-1));
                n=65;
                n=(n+m)-i;
            for (int j =1;j<=m;j++){
                if (j==1){
                    System.out.print((char)n+" ");
                }else if (j==m-i+1){
                    System.out.print((char)n+" ");
                    
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
