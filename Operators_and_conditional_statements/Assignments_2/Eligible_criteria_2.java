import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int m= s.nextInt();
        int p= s.nextInt();
        int c= s.nextInt();
        if (((m+p >= 100) || (m+c >=100)) && (m+p+c >= 180)){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
