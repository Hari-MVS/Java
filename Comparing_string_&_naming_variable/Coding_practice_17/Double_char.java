import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String n= s.nextLine();
        String sum="";
        for (int i =0;i<n.length();i++){
            sum+=n.charAt(i);
            sum+=n.charAt(i);
        }
        System.out.println(sum);
    }
}
