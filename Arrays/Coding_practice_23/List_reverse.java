import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String [] m = s.nextLine().split(" ");
        Collections.reverse(Arrays.asList(m));
        System.out.println(Arrays.toString(m));
        
    }
}
