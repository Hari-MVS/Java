import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sec = s.nextInt();
        System.out.println((long)Math.pow(num,sec));
    }
}
