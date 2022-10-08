import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int test=s.nextInt();
        int[] values = new int[m];
        for (int i =0;i<m;i++){
            values[i]=s.nextInt();
        }
        for (int i=0;i<test;i++){
            int x=s.nextInt();
            System.out.println(values[x]);
            
        }
        
       
    }
}
