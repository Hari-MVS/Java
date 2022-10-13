import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int [] values = {1,6,32,93,71,-20,30,-90,50};
        ArrayList <Integer> greatest = new ArrayList<>();
        for (int i : values){
            if (i >m){
                greatest.add(i);
            }
        }
        System.out.println(greatest);
    }
}
