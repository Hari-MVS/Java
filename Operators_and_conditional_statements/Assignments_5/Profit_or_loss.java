import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (a < b){
            System.out.println("Profit");
        }else if (a==b){
            System.out.println("No Profit - No Loss");

        }else{
            System.out.println("Loss");
        }
    }
}
