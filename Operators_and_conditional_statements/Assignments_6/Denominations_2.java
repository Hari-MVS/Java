import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a= num/100;
        num =num%100;
        int b=num/50;
        num =num%50;
        int c=num/20;
        num =num%20;
        int d=num/10;
        System.out.println("100 Notes: "+a);
        System.out.println("50 Notes: "+b);
        System.out.println("20 Notes: "+c);
        System.out.println("10 Notes: "+d);

    
    }
}
