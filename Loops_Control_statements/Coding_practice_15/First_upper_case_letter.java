import java.util.Scanner;
class Main{
    public static void main(String[]  args){
        Scanner s= new Scanner(System.in);
        String num = s.nextLine();
        
        
        for (int i=0;i<num.length();i++){
            if(Character.isUpperCase(num.charAt(i))){
                System.out.println(num.charAt(i));
                break;
            }
        }
    }
}
