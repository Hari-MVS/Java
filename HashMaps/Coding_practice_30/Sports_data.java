import java.util.*;
class Main {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        
        String[] names = {"Ram","Naresh","Vani","Rahim"};
        String[] games = {"Cricket","Football","Tennis","Cricket"};
        HashMap<String,String>dic=new HashMap<>();
        for(int i =0;i<names.length;i++){
            dic.put(names[i],games[i]);
        }
        for (int i=0;i<m;i++){
            String a = s.next();
            String b = s.next();
            dic.put(a,b);
        }
        
        ArrayList<String> keys=new ArrayList<>(dic.keySet());
        Collections.sort(keys);
        for (String i:keys){
            System.out.printf("%s:%s\n",i,dic.get(i));
        }
    }
}
