import java.util.*;
class Main {

    static int MultiplyByThree(int a)
    {
        return a*3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(MultiplyByThree(a));
        sc.close();

    }
    
}
