import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String [] num = s.nextLine().split(",");
        int k=s.nextInt();
        int [] in = new int [num.length];
        for(int i=0;i<num.length;i++){
            in[i] =Integer.parseInt(num[i]);
        }
        Arrays.sort(in);
        
        System.out.println(in[in.length-k]);
    }
}
