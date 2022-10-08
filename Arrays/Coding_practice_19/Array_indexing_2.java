import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        String [] lan = {"Python","Java","Ruby","C","C++","Go","R","JavaScript","Swift","PHP","Kotlin","Perl"};
        for (int i =0;i<n;i++){
            int m=s.nextInt();
            System.out.println(lan[m]);
            
        }
    }
}
