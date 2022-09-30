import java.util.Scanner;
class Main{
    public static void main(String[]  args){
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        
        int first_num =0;
        for (int i=1;i<=num;i++){
            int sec = s.nextInt();
            if(sec<0){
                System.out.println(sec);
                break;
            }
        }
    }
}
