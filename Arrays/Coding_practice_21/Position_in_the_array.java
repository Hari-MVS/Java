import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int count=0;
        ArrayList<Integer> values= new ArrayList<>();
        
        for (int i=0;i<m;i++){
            values.add(s.nextInt());
        }
        for (int i=0;i<m;i++){
            if (values.get(i)<n && values.get(i+1)>n){
                values.add(i+1,n);
                count+=i+1;
            }
        }
        System.out.println(count);
        System.out.println(values);
    }
}
