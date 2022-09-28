import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if ((m==1)||(m==11)||(m==12)){
            System.out.println("Winter");
        }else if((m==2)||(m==3)){
            System.out.println("Spring");
        }else if((m==4)||(m==5)||(m==6)){
            System.out.println("Summer");
        }else if((m==7)||(m==8)){
            System.out.println("Rainy");
        }else if((m==9)||(m==10)){
            System.out.println("Autumn");
        }
    }
}
