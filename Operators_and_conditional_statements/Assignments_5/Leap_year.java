import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (((a%4)==0) && ((a%100)!=0) || ((a%400)==0)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
