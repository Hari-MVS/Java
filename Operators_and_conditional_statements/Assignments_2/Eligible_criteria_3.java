import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int m= s.nextInt();
        int p= s.nextInt();
        int c= s.nextInt();
        if (((m >= 35) && (p >=35) && (c>=35)) && ((m+p>= 90) || (m+c>=90))){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
