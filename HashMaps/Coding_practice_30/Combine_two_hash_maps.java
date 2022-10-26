import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        // String a = s.nextLine();
        // String b = s.nextLine();
        HashMap<String,Integer> dic= new HashMap<>();
        String[]name=s.nextLine().split(" ");
        for (String i:name){
            int l=s.nextInt();
            dic.put(i,l);
        }
        String[]temp=s.nextLine().split(" ");
        String[]name2=s.nextLine().split(" ");
        for (String i:name2){
            int l=s.nextInt();
            dic.put(i,l);
        }
        ArrayList<String>keys=new ArrayList<>(dic.keySet());
        Collections.sort(keys);
        for (String i:keys){
            System.out.printf("%s:%d\n", i,dic.get(i));
        }
    }
}
