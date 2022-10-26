import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        int m=s.nextInt();
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> temp= new HashSet<>();
        // HashSet<Integer> set2= new HashSet<>();
        int count=0,i=1;
        while (count<m){
            if (i%2==0 ){
                if(i%3!=0){
                    set1.add(i);
                }else{
                    temp.add(i);
                }
                count+=1;
            }
            i+=1;
        }
        ArrayList<Integer>res1= new ArrayList<>(set1);
        Collections.sort(res1);
        System.out.println(res1);
        int count2=0,j=1;
        while (count2<m){
            if (j%3==0 ){
                
                set1.add(j);
                count2+=1;
            }
            j+=1;
        }
        set1.removeAll(temp);
        ArrayList<Integer>res2= new ArrayList<>(set1);
        Collections.sort(res2);
        System.out.println(res2);
        
    }
}
