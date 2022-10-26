import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num=s.nextLine();
        int sum=0,lar=0;
        String ch="";
        for (char i :num.toCharArray()){
            if (Character.isDigit(i)){
                ch+=i;
                sum+= Character.getNumericValue(i);
                if (lar<Character.getNumericValue(i)){
                    lar=Character.getNumericValue(i);
                }
            }
        }
        int smal=Character.getNumericValue(ch.charAt(0));
        for (char i: ch.toCharArray()){
            if (smal> Character.getNumericValue(i)){
                smal=Character.getNumericValue(i);
            }
        }
        
        System.out.println(sum);
        System.out.println(smal);
        System.out.println(lar);
    }
}
