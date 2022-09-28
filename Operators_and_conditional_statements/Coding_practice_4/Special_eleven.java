import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if (((m%11)==0)||((m%11)==1)){
            System.out.println("Special Eleven");
        }else{
            System.out.println("Normal Number");
        }
    }
}
