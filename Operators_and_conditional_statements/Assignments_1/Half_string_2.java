import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        System.out.println(m.substring(m.length()/2,m.length()));
    }
}
