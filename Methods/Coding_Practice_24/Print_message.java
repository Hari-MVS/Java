import java.util.Scanner;

class Main {

    static String message(String name, int age) {
        String mes = name+" is "+age+" years old.";
        return mes;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println(message(name,age));

        sc.close();
    }
}
