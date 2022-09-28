import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i,j;
        for (i = 1; i <= num; i++)
        {
            for (j = 1; j <= num; j++)
            {
                if (i == 1 || i == num ||
                    j == 1 || j == num)           
                    System.out.print("* ");           
                else
                    System.out.print("  ");           
            }
            System.out.println();
        }
