import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a= num/500;
        num =num%500;
        int b=num/50;
        num =num%50;
        int c=num/10;
        num =num%10;
        int d=num/1;
        System.out.print("500: "+a+" ");
        System.out.print("50: "+b+" ");
        System.out.print("10: "+c+" ");
        System.out.print("1: "+d+" ");

    
    }
}
