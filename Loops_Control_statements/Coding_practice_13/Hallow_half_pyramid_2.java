import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        for (int i =1;i<=m;i++){
            for (int j =1;j<=m;j++){
                if ( j==1 ){
                    System.out.print(j+" ");
                }else if(j==i || i==m ){
                    System.out.print(j+" ");
                }else{
                    System.out.print("  ");
                    
                }
            }
            System.out.println();
                
            
        }
    }
}
