import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        if (m%6==0){
            System.out.println("Number is divisible by 6");
        }else if(m%3==0){
            System.out.println("Number is divisible by 3");
        }else if(m%2==0){
            System.out.println("Number is divisible by 2");
        }else{
            System.out.println("Number is not divisible by 2, 3 or 6");
        }
    }
}
