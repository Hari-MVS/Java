import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        String word = w.nextLine();
        int integer = w.nextInt();
        char result = word.charAt(integer);

        System.out.println(result);
        
        
    }
}