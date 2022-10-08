import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        // int count=0;
        int [][] values = new int[m][n];
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++)
                values[i][j]=s.nextInt();
        }
        
        for (int i=0;i<m;i++){
            ArrayList<Integer>val= new ArrayList<>();
            if (i>n-1){
                System.out.println(Arrays.toString(values[i]));
                
            }else{
                
                for (int j=0;j<=i;j++){
                    val.add(values[i][j]);
                }
                System.out.println(val);
            }
        }
        // System.out.println(count);
        // System.out.println(values);
    }
}
