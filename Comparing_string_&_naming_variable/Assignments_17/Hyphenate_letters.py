import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        String n=m.valueOf(m.charAt(0));
        for (int i=1;i<m.length();i++){
            n+="-"+m.charAt(i);
        }
        System.out.println(n);
    }
}
