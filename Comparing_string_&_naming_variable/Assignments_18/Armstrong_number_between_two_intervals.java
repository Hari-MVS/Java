import java.math.BigInteger;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        long square = 0;
        int count =0;
        for (int i =n;i<=m;i++){
            square=0;
            String val = String.valueOf(i);
            int len =val.length();
            for (int j=0;j<len;j++){
                
                square+= (int)Math.pow(Character.getNumericValue(val.charAt(j)),len);
            }
            if (square == i){
                count+=1;
              System.out.print(i+" ");  
            }
            
        }
        if (count==0){
            System.out.println(-1);
        }
    }
}
