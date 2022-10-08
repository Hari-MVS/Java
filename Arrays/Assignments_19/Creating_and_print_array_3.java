import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int[] values = new int[m];
        for (int i =0;i<m;i++){
            values[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(values));
    }
}
