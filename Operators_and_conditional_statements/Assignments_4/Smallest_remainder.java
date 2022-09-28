import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int a= (m%n);
        int b = (n%m);
        if (a>b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}
