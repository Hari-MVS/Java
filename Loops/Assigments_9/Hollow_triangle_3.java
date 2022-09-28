import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int m= s.nextInt();
        for (int i=0;i<=m;i++){
            System.out.print("_");
        }
        System.out.println();
        for (int j=0;j<m;j++){
            System.out.print("|");   
            System.out.print(" ".repeat(m-j-1));   
            System.out.print("/");   
            System.out.println();
            }
        System.out.println();
        }
    }
