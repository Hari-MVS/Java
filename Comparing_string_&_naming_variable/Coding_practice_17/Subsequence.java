import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String m =s.nextLine();
        String n =s.nextLine();
        int count =0,j=0;
        if(m.length()==0){
            System.out.println("Yes");
        }
        if(n.length()==0){
            System.out.println("No");
        }
        for (int i =0;i<n.length();i++){
            
            while (j<m.length()){
                if (n.charAt(i) == m.charAt(j)){
                    count+=1;
                    j+=1;
                    
                    break;
                }
                j+=1;
            }
        }
        System.out.println((count==n.length())? "Yes" : "No");
    }
}
