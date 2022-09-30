import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int count= 0;
        int largest= m;
        for (int i =1;i<=m;i++){
            if (m%largest==0){
                count+=1;
            }
            if (count==n){
                System.out.println(largest);
                break;
            }
            largest-=1;
        }
       
    }
}
