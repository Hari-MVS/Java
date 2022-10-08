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
        int x =s.nextInt();
        int y =s.nextInt();
        for (int i =0;i<row;i++){
            for (int k=0;k<col;k++){
                if (values[i][k]==x){
                    values[i][k]=y;
                }
                System.out.print(values[i][k]+" ");
            }
            System.out.println();
        }
    }
}
