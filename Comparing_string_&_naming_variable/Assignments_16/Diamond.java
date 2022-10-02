import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m =s.nextInt();
        for (int i=1;i<=m;i++){
            System.out.print(". ".repeat(m-i)+"0 ".repeat(2*i-1)+". ".repeat(m-i));
            System.out.println();
        }
        for (int i=1;i<m;i++){
            System.out.print(". ".repeat(i)+"0 ".repeat((2*m)-(2*i)-1)+". ".repeat(i));
            System.out.println();
        }
    }
}
