import java.util.Scanner;
class Main{
    public static void main(String[]  args){
        Scanner s= new Scanner(System.in);
        String num = s.nextLine();
        String word = "";
        
        for (int i=0;i<num.length();i++){
            word+=(Character.toUpperCase(num.charAt(i)));
            if(Character.isWhitespace(num.charAt(i))){
                word+=num.substring(i+1,num.length());
                break;
            }
        }
        System.out.println(word);
    }
}
