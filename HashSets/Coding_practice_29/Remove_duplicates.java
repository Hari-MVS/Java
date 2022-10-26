import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        String[] set1=s.nextLine().split(" ");
        // String[] set2=s.nextLine().split(",");
        HashSet <Integer> coset1=new HashSet <>();
        // HashSet <Integer> coset2=new HashSet<>();
        for(String i :set1){
            coset1.add(Integer.parseInt(i));
        }
        
        
        ArrayList<Integer> sort= new ArrayList<>(coset1);
        Collections.sort(sort);
        System.out.println(sort);
    }
}
