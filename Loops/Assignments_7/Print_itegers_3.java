import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        long i=num;
        while(i>0){
            System.out.println(i);
            i=i-1;
        }
    }
}
