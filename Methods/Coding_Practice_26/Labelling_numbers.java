import java.util.Scanner;

class Main {

    static void showNumbers(int n) {
        
        for (int i=0;i<=n;i++){
            if (i%2==0){
                System.out.println( i+" "+"EVEN");
            }else{
                System.out.println( i+" "+"ODD");
            }
        }
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        showNumbers(n);

        sc.close();

    }

}
