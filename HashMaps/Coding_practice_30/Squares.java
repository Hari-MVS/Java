import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        HashMap<Integer,Integer>dic=new HashMap<>();
        for(int i =1;i<=m;i++){
            dic.put(i,i*i);
        }
        
        ArrayList<Integer> keys=new ArrayList<>(dic.keySet());
        Collections.sort(keys);
        for (Integer i:keys){
            System.out.printf("%d: %d\n",i,dic.get(i));
        }
    }
}
