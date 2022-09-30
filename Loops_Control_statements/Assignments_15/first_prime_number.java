import java.util.Scanner;
class Main{
    public static void main(String[]  args){
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        
        boolean flag = false;
        int first_prime =0;
        for (int i=1;i<=num;i++){
            int sec = s.nextInt();
            flag= false;
            if(sec==1){
                continue;
            }
            for (int j=2;j<=sec;j++){
                if (sec==j){
                    break;
                }else if (sec%j==0){
                    flag= true;
                }
            
            }
            if (flag == false){
                System.out.println(sec);
                break;
            }
        }
    }
}
