import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sec = s.nextInt();
        for(int i=num;i<=sec;i+=1){
            System.out.println(i);
        }
    }
}
