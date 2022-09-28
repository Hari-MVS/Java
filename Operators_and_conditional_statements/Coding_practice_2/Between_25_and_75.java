import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        String n = (m>25) && (m<75)? "True" : "False" ;
        System.out.print(n);

    }
}
