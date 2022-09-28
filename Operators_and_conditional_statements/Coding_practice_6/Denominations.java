import java.util.Scanner;
class denomination{
public static void main(String[]args){

    int note100, note50, note10,note2, 
    note1;
    note100=note50=note10=note1=0;
    Scanner sc=new Scanner(System.in);
    int amount=sc.nextInt();
    if(amount>=100)
    {
    note100=amount/100;
    amount-=note100*100;
    }
    if(amount>=50)
    {
    note50=amount/50;
    amount-=note50*50;
    }
    if(amount>=10)
    {
    note10=amount/10;
    amount-=note10*10;
    }
    if(amount>=1)
    {
    note1=amount;
    }
    System.out.println("100:"+note100);
    System.out.println("50:"+note50);
    System.out.println("10:"+note10);
    System.out.println("1:"+note1);
    }
}
