import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int row =s.nextInt();
        int col =s.nextInt();
        int x =s.nextInt();
        int y =s.nextInt();
        int [][] dime = new int[row][col];
        for (int i =0;i<row;i++){
            for (int j =0;j<col;j++){
                dime[i][j]=s.nextInt();
            }
        }
        System.out.println(dime[x][y]);
    }
}
