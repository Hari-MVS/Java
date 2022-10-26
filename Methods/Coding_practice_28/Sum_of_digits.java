import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String n=s.nextLine();
        int sum=0;
        for (char i:n.toCharArray()){
            sum+= Character.getNumericValue(i);
        }
        System.out.println(sum);
    }
}
