import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float m = s.nextFloat();

        if (m>85){
            System.out.println("A");
        }else if(m>70){
            System.out.println("B");
        }else if(m>=60){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }
}
