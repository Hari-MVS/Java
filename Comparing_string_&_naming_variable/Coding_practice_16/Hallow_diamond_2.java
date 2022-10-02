import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int med =2*m;
        for (int i =0;i<m;i++){
            System.out.print("* ".repeat(m-i)+"  ".repeat(2*i)+"* ".repeat(m-i));
            System.out.println();
        }
        for (int j =1;j<=m;j++){
            System.out.print("* ".repeat(j)+"  ".repeat(med-(2*j))+"* ".repeat(j));
            System.out.println();
        }
    }
}
