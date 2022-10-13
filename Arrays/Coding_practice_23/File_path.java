import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String [] m = s.nextLine().split(" ");
        String n=m[0];
        for (int i = 1;i<m.length-1;i++){
            if (m[m.length-1].equals("WIN")){
                n+=">"+m[i];
            }else{
                n+="/"+m[i];
            }
        }
        System.out.println(n);
    }
}
