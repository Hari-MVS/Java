import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        String [] names = new String[n+1];
        
        for (int i=0;i<=n;i++){
            String name = s.nextLine();
            names[i] =name;
        }
        
        for (int i=n;i>=1;i--){
            System.out.println(names[i]);
        }
    }
}
