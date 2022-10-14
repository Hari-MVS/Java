import java.util.*;
class Main {

    static Character secondChar(String a) {
        return a.charAt(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.println(secondChar(n));
        sc.close();

    }

}
