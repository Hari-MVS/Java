import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m = s.nextInt();
        if ((int)Math.pow(n,m) > (int)Math.pow(m,n)){
            System.out.println((int)Math.pow(n,m));
        }else{
            System.out.println((int)Math.pow(m,n));
        }
    }
}
