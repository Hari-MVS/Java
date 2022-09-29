import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        for (int i =1;i<=m;i++){
                System.out.println("* ".repeat(i)+"  ".repeat(2*m-2*i)+"* ".repeat(i));
        }
        for (int i =m;i>0;i--){
                System.out.println("* ".repeat(i)+"  ".repeat(2*m-2*i)+"* ".repeat(i));
        }
    }
}
