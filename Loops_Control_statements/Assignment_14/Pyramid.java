import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println(". ".repeat(m-1)+"0 "+". ".repeat(m-1));
        for (int i =1;i<m;i++){
                System.out.println(". ".repeat(m-i-1)+"0 ".repeat(i*2+1)+". ".repeat(m-i-1));
        }
    }
}
