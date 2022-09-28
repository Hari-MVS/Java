import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        int n = s.nextInt();
        String o = m.substring(m.length()-3,m.length());
        System.out.println(o.repeat(n));
    }
}