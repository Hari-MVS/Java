import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int row= s.nextInt();
        int col= s.nextInt();
        int [][] values=new int[row][col];
        for (int i =0;i<row;i++){
            for (int j=0;j<col;j++){
                values[i][j]=s.nextInt();
            }
            
        }
        int[] out= (row>col)? new int[col] : new int[row];
        for (int i =0;i<row;i++){
            
            out[i]=values[i][i+1-1];
            if (i==col-1){
                break;
            }
        }
        System.out.println(Arrays.toString(out));
    }
}
