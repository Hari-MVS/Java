import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int o = s.nextInt();
        System.out.println(((m+n >o)&&(n+o>m)&&(o+m>n))? "It's a Triangle" :"It's not a Triangle");
    }
}
