import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        if (m>n){
            System.out.println(m);
        }else{
            System.out.println(n);
        }
    }
}
