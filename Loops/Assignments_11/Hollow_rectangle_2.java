import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        int sec=s.nextInt();
        
        System.out.println("+"+("-").repeat(sec)+"+");
        for (long i=1;i<=num;i++){
            System.out.print("|"+(" ").repeat(sec)+"|");
            System.out.println();
        }
        System.out.println("+"+("-").repeat(sec)+"+");
    }
        
}
