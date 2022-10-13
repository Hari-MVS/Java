import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        Integer [] values= {10,20,40,50,60};
        ArrayList<Integer> values2 = new ArrayList <>(Arrays.asList(values));
        values2.add(n,m);
        System.out.println(values2);
    }
}
