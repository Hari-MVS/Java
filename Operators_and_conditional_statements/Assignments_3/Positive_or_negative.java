import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float m = s.nextFloat();
        if (m<0){
            System.out.println("Negative");
        }else{
            System.out.println("Positive");
        }
    }
}
