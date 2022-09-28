import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        boolean res = false;
        for (int i=2;i<num;i++){
            if (num%i ==0){
                res = true;
            }
        }
        if (res){
            System.out.println("Not a Prime Number");
        } else {
            System.out.println("Prime Number");
        }
    }
}
