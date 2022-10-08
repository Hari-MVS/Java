import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int count = 0;
        for (int i=1;i<=m;i++){
            for (int j=1;j<=m;j++){
                for (int k=1;k<=m;k++){
                    if(i<j && j<k){
                        if (Math.pow(k,2)==(Math.pow(i,2)+Math.pow(j,2))){
                            count+=1;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
