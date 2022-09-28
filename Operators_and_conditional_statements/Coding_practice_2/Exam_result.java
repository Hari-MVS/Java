import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        String n = (m>50)? "PASS" : "FAIL" ;
        System.out.print(n);

    }
}
