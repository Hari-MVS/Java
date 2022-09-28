import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println(((m%9==0)||(m/10==9)||(m%10==9))?"Lucky Number" : "Unlucky Number");
    }
}
