import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if ((m%2 ==0) || (m%3 ==0) || (m%5==0) || (m%7==0)){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
