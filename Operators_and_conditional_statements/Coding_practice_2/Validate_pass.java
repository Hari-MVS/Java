import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        String n = (m.length()>7)? "True" : "False" ;
        System.out.print(n);

    }
}
