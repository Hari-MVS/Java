import java.util.Scanner;
class Main {

    static String message(String name)
    {
        return name;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Welcome"+" "+ message(name));

        sc.close();
    }
    
}
