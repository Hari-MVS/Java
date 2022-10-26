import java.util.*;
class Main {
    public static void main(String[] args) { 
        String[] fruits = { "apples", "bananas", "mangoes", "oranges", "watermelons" };
        Integer[] quantities = { 10, 20, 15, 200, 50 };
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        HashMap<String,Integer> dic= new HashMap<>();
        for(int i =0;i<fruits.length;i++){
            if (fruits[i].equals(a)){
                dic.put(b,quantities[i]);
            }else{
                dic.put(fruits[i],quantities[i]);
            }
        }
        ArrayList<String>keys=new ArrayList<>(dic.keySet());
        Collections.sort(keys);
        for (String i:keys){
            System.out.printf("%s %d\n", i,dic.get(i));
        }
    }
}
