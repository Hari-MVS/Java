import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        Integer [] values= {10,20,30,40,50,60,70,80,90,100};
        ArrayList<Integer> values2 = new ArrayList <>(Arrays.asList(values));
        int len =values2.size()-1;
        for (int i =m;i>0;i--){
            values2.remove(values2.get(len));
            len-=1;
        }
        System.out.println(values2);
    }
}
