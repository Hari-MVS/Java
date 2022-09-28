import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        for (int i =1;i<=m;i++){
                System.out.print(" ".repeat(m-i));
            for (int j =1;j<=i;j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }
}
