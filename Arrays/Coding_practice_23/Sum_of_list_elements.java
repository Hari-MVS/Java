import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String [] m = s.nextLine().split(" ");
        long sum = 0;
        for (String i: m){
            sum+=Integer.parseInt(i);
        }
        System.out.println(sum);
    }
}
