import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        String n = "";
        int i;
        for (i = 0;i <= num.length()-1;i++){
            if (Character.isUpperCase(num.charAt(i))){
                n += Character.toLowerCase(num.charAt(i));
            }else if(Character.isLowerCase(num.charAt(i))){
                n += Character.toUpperCase(num.charAt(i));
            }else{
                n += " ";
            }
        }
        System.out.println(n);
    }
}
