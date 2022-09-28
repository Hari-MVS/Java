import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        int len = m.length()-2;
        String start = m.substring(0,2);
        String mid = m.substring(2,(m.length()-2));
        String end = m.substring(len,m.length());
        System.out.print(start+("*".repeat(mid.length()))+end);

    }
}
