import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        Scanner B = new Scanner(System.in);
        int res = A.nextInt();
        int r = B.nextInt();
        
        System.out.println(A);
        A.close();
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstValue = input.nextInt();
        int secondValue = input.nextInt();

        System.out.println(firstValue);
        System.out.println(secondValue);
        input.close();  // closing Scanner object
    }
}