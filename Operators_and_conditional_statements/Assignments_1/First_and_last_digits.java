import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s= new Scanner(System.in);
        String m = s.nextLine();
        System.out.println(m.charAt(0));
        System.out.println(m.charAt(m.length()-1));
    }
}
