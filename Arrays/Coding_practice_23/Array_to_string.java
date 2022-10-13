import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String [] m = s.nextLine().split(" ");
        String n=m[0];
        for (int i = 1;i<m.length;i++){
            n+=","+m[i];
        }
        System.out.println(n);
    }
}
