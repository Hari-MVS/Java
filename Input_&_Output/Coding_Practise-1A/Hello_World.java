import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String res = s.nextLine();
        System.out.println("Hello "+res);

        s.close();
    }
}