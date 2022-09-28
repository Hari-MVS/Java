import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String res = s.nextLine();
        char m = res.charAt(0);
        char n = res.charAt(1);
    
        System.out.print(n);
        System.out.print(m);

        s.close();
    }
}