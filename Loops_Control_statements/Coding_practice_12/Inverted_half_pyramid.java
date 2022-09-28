import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        
        for (int i=0;i<num;i++){
            int res =1;
            for (int j=0;j<num-i;j++){
                System.out.print(res+" ");
                res+=1;
            }
            System.out.println();
        }
        }
        
    }
