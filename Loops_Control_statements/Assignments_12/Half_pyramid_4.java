import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int k=0,l=0;
        for (int i =0;i<=n;i++){
            k=k+i;
        l =k+m-1;
        }
        for (int i =1;i<=n;i++){
        
            for (int j =1;j<=i;j++){
                System.out.print(l+" ");
                l=l-1;
            }
            System.out.println();
        }
    }
}
