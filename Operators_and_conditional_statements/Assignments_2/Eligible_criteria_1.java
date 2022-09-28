import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int m= s.nextInt();
        int n= s.nextInt();
        int o= s.nextInt();
        if (m+n+o >= 180){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
