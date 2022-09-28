import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println((m==6) ||(n==6)||(m+n==6)||((Math.abs(m-n))==6)? "Lucky" :"Not Lucky");
        
    }
}
