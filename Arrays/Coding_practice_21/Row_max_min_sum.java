import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int [][] values= new int[m][n];
        int [] max= new int[m];
        int [] min= new int[m];
        int [] sum= new int[m];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                values[i][j]=s.nextInt();
            }
        }
        for (int i=0;i<m;i++){
            min[i]=values[i][0];
            int count=0;
            for (int j =0;j<n;j++){
                
                if (values[i][j]> max[i]){
                    max[i]=values[i][j];
                }
                if(values[i][j]<min[i]){
                    min[i]=values[i][j];
                }
                count+=values[i][j];
                
            }
            sum[i]=count;
        }
        System.out.println(Arrays.toString(max));
        System.out.println(Arrays.toString(min));
        System.out.println(Arrays.toString(sum));
        
    }
}
