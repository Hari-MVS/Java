import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        int n = s.nextInt();
        String start =m.substring(0,n);
        String end =m.substring(n+1);
        System.out.print(start+end);

    }
}
