import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        ArrayList<Integer> values2 = new ArrayList <Integer>(Arrays.asList(5,10,20,35,5,50,20,100,200,10,150,100,100,20,20));
        
        System.out.println(Collections.frequency(values2,m));
    }
}
