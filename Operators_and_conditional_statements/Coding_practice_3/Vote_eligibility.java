import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if (m>=18){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}
