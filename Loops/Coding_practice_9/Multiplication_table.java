import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i,res=0;
        for (i=1;i<=10;i++){
            res=num*i;
            System.out.println(num + (" x ") + i + (" = ") + res);
            res=0;
        }
          
    }
}
