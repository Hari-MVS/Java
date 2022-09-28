import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int o = s.nextInt();
        if ((m>n)&&(m>o)){
            System.out.println(m);
        }else if ((n>m)&&(n>o)){
            System.out.println(n);
        }else{
            System.out.println(o);
        }
    }
}
