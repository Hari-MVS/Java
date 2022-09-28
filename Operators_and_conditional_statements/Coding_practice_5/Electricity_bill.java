import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        double n =0.0;
        if (a<=50){
            n=(a*2);
        }else if(a>50 && a<=150){
            n=(50*2) +(a-50)*3;
        }else if(a>150 && a<=250){
            n=(50*2) +(100*3)+(a-150)*5;
        }else if(a>=250){
            n=(50*2) +(100*3)+(100*5)+(a-250)*8;
        }
        System.out.println((n+(n/100)*20));
    }
}
