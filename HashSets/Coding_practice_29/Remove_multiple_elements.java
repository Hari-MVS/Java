import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        String[] set1=s.nextLine().split(" ");
        int[] value = {10,20,30,40,50,60,70,80,90,100};
        HashSet <Integer> coset1=new HashSet<>();
        HashSet <Integer> coset2=new HashSet<>();
        for (int i :value){
            coset1.add(i);
        }
        for(String i :set1){
            coset2.add(Integer.parseInt(i));
        }
        coset1.removeAll(coset2);
        ArrayList<Integer> sort= new ArrayList<>(coset1);
        Collections.sort(sort);
        System.out.println(sort);
    }
}
