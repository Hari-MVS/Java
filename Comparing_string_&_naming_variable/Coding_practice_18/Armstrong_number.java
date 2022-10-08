import java.math.BigInteger;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String n=s.nextLine();
        int len =n.length();
        long square = 0;
        for (int i =0;i<len;i++){
            square+= (int)Math.pow(Character.getNumericValue(n.charAt(i)),len);
            
            
        }
        System.out.println((square==Integer.parseInt(n))? "Armstrong Number" : "Not an Armstrong Number");
    }
}
