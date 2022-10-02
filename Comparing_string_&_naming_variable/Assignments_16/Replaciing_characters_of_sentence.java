import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String m = s.nextLine();
        String ne="";
        for (int i =0;i<m.length();i++){
            if (Character.isWhitespace(m.charAt(i))){
                ne+=" ";
            }else{
                ne+=(char)((int)m.charAt(i)+1);
            }
        }
        System.out.println(ne);
    }
}
