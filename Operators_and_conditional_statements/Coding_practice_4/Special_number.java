import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        int fir = Integer.parseInt(num);
        int one = fir/10;
        int two = fir%10;

        if ((one ==7)||(two==7)||((one+two)==7)||((fir)%7==0)){
            System.out.println("Special Number");
        }else{
            System.out.println("Normal Number");
        }
    }
}
