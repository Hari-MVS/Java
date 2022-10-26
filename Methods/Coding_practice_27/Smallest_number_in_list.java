import java.util.*;
class Main{
    static int largestNum(String []num){
        int great = Integer.parseInt(num[0]);
        for (int i=1;i<num.length;i++){
            if (great>Integer.parseInt(num[i])){
                great=Integer.parseInt(num[i]);
            }
        }
        return great;
        
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String [] num = s.nextLine().split(",");
        System.out.println(largestNum(num));
    }
}
