import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        if ((m>=4)&&(m<12)){
            System.out.println("Good Morning");
        }else if((m>=12)&&(m<16)){
            System.out.println("Good Afternoon");
        }else if((m>=16)&&(m<20)){
            System.out.println("Good Evening");
        }else if((m>=20)||(m<4)){
            System.out.println("Good Night");
        }
    }
}
