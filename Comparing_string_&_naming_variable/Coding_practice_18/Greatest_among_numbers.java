import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int greatest = s.nextInt();
        for (int i =1;i<n;i++){
            int num = s.nextInt();
            if (greatest <= num){
                greatest=num;
            }
        }
        System.out.println(greatest);
    }
}
