import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        String res = "";
        int i;
        for (i=0;i<=num.length()-1;i++){
            res=num.charAt(i)+res;
        }
        
        System.out.println(res);
    }
}
