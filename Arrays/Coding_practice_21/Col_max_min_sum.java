import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int [][] values= new int[m][n];
        int [] max= new int[n];
        int [] min= new int[n];
        int [] sum= new int[n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                values[i][j]=s.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            int count=0;
            for (int j =0;j<m;j++){
                if(j==0){
                    min[i]=values[j][i];
                    max[i]=values[j][i];
                }
                if (values[j][i]> max[i]){
                    max[i]=values[j][i];
                }
                
                if(values[j][i]<min[i]){
                    min[i]=values[j][i];
                }
                
                count+=values[j][i];
                
                
            }
            sum[i]=count;
        }
        System.out.println(Arrays.toString(max));
        System.out.println(Arrays.toString(min));
        System.out.println(Arrays.toString(sum));
        
    }
}
