import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int[] values = new int[m];
        for (int i =0;i<m;i++){
            values[i]=s.nextInt();
        }
        int len = values.length-1;
        int []out= new int[4];
        System.arraycopy(values,0,out,0,2);
        System.arraycopy(values,len-1,out,2,2);
        
    
        System.out.println(Arrays.toString(out));
        
       
    }
}
