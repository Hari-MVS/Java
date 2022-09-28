import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        String sh ="";
        for (int i=1;i<=num.length();i++){
            int res=s.nextInt();
            sh+=num.charAt(res);
            }
        System.out.println(sh);
        }
        
    }
