import java.util.Scanner;
class Main{
    public static void main(String[]  args){
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        int sec = s.nextInt();
        boolean flag = false;
        for (int i=num;i<=sec;i++){
            flag= false;
            for (int j=2;j<=sec;j++){
                if (i==j){
                    break;
                }else if (i%j==0){
                    flag= true;
                }
            
            }
            if (flag == false){
                System.out.println(i);
            }
        }
    }
}
