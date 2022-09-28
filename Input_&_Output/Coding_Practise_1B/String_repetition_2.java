import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        int n = s.nextInt();
        System.out.println(m.repeat(n));
    }
}