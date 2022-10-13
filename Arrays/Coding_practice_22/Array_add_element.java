import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        Integer [] values= {2,4,6,8,10,12};
        ArrayList<Integer> values2 = new ArrayList <>(Arrays.asList(values));
        values2.add(m);
        System.out.println(values2);
    }
}
