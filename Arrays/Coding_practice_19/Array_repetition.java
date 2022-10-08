import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m =s.nextInt();
        int col =s.nextInt();
        int [] rep = new int[col];
        for (int i =0;i<col;i++){
            rep[i]=m;
            
        }
        System.out.println(Arrays.toString(rep));
    }
}
