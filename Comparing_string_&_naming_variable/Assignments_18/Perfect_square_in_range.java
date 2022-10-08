import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        long count=0;
        for (long i=m;i<=n;i++){
            int temp =(int)Math.pow(i,0.5);
            if (temp*temp == i){
                count+=1;
            } 
        }
        System.out.println(count);
    }
}
