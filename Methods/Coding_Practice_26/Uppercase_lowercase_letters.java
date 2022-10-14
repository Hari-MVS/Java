import java.util.Scanner;

class Main {

    static void getLowerAndUpperCaseLetters(String s) {
        String up="",low="";
        for (int i=0;i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i))){
                up+=String.valueOf(s.charAt(i));
            }else{
                low+=String.valueOf(s.charAt(i));
            }
        }
        System.out.println(up);
        System.out.println(low);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        getLowerAndUpperCaseLetters(s);
        sc.close();

    }

}
