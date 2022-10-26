import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        String m = s.next();
        String n = s.next();
        String[] names = {"Ram","Naresh","Vani","Rahim","Deepak"};
        String[] games = {"Cricket","Football","Tennis","Cricket","Boxing"};
        HashMap<String,String>dic=new HashMap<>();
        for(int i =0;i<names.length;i++){
            dic.put(names[i],games[i]);
        }
        dic.put(m,n);
        ArrayList<String> keys=new ArrayList<>(dic.keySet());
        Collections.sort(keys);
        for (String i:keys){
            System.out.printf("%s:%s\n",i,dic.get(i));
        }
    }
}
