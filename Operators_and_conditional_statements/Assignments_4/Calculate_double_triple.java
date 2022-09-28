import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if (m%3 == 0){
            System.out.println(m*3);
        }else{
            System.out.println(m*2);
        }
    }
}
