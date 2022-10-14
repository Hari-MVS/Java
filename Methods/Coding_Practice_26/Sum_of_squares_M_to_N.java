import java.util.Scanner;

class Main {

    static int sumOfSquaresMToN(int a, int b) {
        int sum=0;
        for (int i =a;i<=b;i++){
            sum+=Math.pow(i,2);
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumOfSquaresMToN(a,b));

        sc.close();
    }

}
