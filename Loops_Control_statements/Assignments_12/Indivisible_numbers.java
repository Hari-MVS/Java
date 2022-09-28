import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        long count=0,res=0;
        for (int i =1;i <=m;i++){
            count=0;
            for (int k =2;k<11;k++){
                if (i%k==0){
                    count+=1;
                }
            }
            if(count==0){
                res+=1;
            }
            
        }
        System.out.println(res);
    }
}
