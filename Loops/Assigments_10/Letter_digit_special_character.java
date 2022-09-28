import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char num = s.next().charAt(0);
        if (Character.isDigit(num)){
            System.out.println("Digit");
        } else if (Character.isLowerCase(num)){
            System.out.println("Lowercase Letter");
        } else if (Character.isUpperCase(num)){
            System.out.println("Uppercase Letter");
        } else {
            System.out.println("Special Character");
        }
        
        
    }
}
