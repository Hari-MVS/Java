import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int [] values2 = {5,10,20,35,5,50,20,100,200,10,150,100,100};
        ArrayList<Integer> values = new ArrayList<>();
        int len= values2.length;
        
        for (int i=0;i<len;i++){
            
            if (values2[i]==m){
                continue;
            }else{
                values.add(values2[i]);
            }
            
        }
        System.out.println(values);
    }
}
