import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String res = s.nextLine();
        int r = s.nextInt();
        System.out.println(res.concat(" ").repeat(r)) ;

        s.close();
    }
}