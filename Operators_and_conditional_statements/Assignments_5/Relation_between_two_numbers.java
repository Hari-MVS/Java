import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a < b){
            System.out.println("A < B");
        }else if (a==b){
            System.out.println("A == B");

        }else{
            System.out.println("A > B");
        }
    }
}
