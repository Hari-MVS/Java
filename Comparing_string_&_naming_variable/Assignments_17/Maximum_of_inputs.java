import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n=s.nextInt();
        System.out.println(n);
        for (int i=1;i<m;i++){
            int k = s.nextInt();
            if (n>=k){
                System.out.println(n);
            }else {
                n=k;
                System.out.println(k);
            }
        }
    }
}
