import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if (m>0){
            System.out.println("Positive");
        }else if (m<0){
            System.out.println("Negative");
        }else if(m==0){
            System.out.println("Zero");
        }
    }
}
