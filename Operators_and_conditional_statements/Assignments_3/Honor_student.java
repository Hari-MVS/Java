import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if (m<10){
            System.out.println("HONOR STUDENT");
        }else{
            System.out.println("NORMAL STUDENT");
        }
    }
}
