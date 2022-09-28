import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int res =1;
        for (int i=0;i<num;i++){
            for (int j=0;j<num;j++){
                System.out.print(res+" ");
                res+=1;
            }
            System.out.println();
        }
        }
        
    }
