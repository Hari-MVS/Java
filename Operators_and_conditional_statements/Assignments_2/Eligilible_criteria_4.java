import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int m= s.nextInt();
        int p= s.nextInt();
        int c= s.nextInt();
        if ((((m >= 60) && (p >=50) && (c>=45)) && (m+p+c >=180)) || ((m+p>= 120) || (c+p>=110))){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
