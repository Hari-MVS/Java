import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        int len = m.length()-2;
        String start = String.valueOf(m.charAt(0));
        String mid = "*".repeat(len);
        String end = String.valueOf(m.charAt(m.length()-1));
        System.out.print(start+mid+end);

    }
}
