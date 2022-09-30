import java.util.Scanner;
class Main{
    public static void main(String[]  args){
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        int sec = s.nextInt();
        boolean flag = false;
        int first_prime =0;
        for (int i=num;i<=sec;i++){
            flag= false;
            if(i==1){
                i=i+1;
            }
            for (int j=2;j<=sec;j++){
                if (i==j){
                    break;
                }else if (i%j==0){
                    flag= true;
                }
            
            }
            if (flag == false){
                System.out.println(i);
                break;
            }else if (i==sec && flag==true){
            System.out.println("No prime numbers in the given range");
            }
        }
    }
}
