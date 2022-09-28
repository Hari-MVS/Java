import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        int m = s.nextInt();
        int n = s.nextInt();
        if (c == '+'){
            System.out.println(m+n);
        }else if(c == '-'){
            System.out.println(m-n);
        }else if(c == '*'){
            System.out.println(m*n);
        }else if(c == '/'){
            System.out.println((float)(m/n));
        }else if(c == '%'){
            System.out.println(m%n);
        }
    }
}
