import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        for (int i =0;i<m;i++){
                System.out.print(" ".repeat(i));
            for (int j =1;j<m-i+1;j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}
