import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int sum=0;
        for (int i =1;i<=n;i++){
            int m=s.nextInt();
            sum+=m;
            System.out.println(sum);
        }
    }
}
