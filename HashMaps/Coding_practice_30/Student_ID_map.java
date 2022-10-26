import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] names=s.nextLine().split(",");
        String[] values=s.nextLine().split(",");
        HashMap<String,String> dic= new HashMap<>();
        for(int i =0;i<names.length;i++){
            dic.put(names[i],values[i]);
        }
        ArrayList<String>keys=new ArrayList<>(dic.keySet());
        Collections.sort(keys);
        for (String i:keys){
            System.out.printf("%s:%s\n", i,dic.get(i));
        }
    }
}
