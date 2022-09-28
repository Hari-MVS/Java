import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int e=num/2000;
        num%=2000;
        int f=num/500;
        num%=500;
        int a= num/200;
        num %=200;
        int b=num/50;
        num %=50;
        int h=num/20;
        num%=20;
        int c=num/5;
        num %=5;
        int d=num/2;
        num%=2;
        int g=num/1;
        System.out.print("2000:"+e+" ");
        System.out.print("500:"+f+" ");
        System.out.print("200:"+a+" ");
        System.out.print("50:"+b+" ");
        System.out.print("20:"+h+" ");
        System.out.print("5:"+c+" ");
        System.out.print("2:"+d+" ");
        System.out.print("1:"+g+" ");

    
    }
}
