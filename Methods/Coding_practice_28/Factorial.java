import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        // int b=s.nextInt();
        long product=1;
        for (int i=1;i<=a;i++){
            product*=i;
        }
        System.out.println(product);
    }
}
