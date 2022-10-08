import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println((int)Math.pow(Math.pow(m,2)+Math.pow(n,2),0.5));
    }
}
