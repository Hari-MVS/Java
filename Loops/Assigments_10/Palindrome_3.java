import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        String res = "";
        int i;
        for (i = 0;i <= num.length()-1;i++){
            if (Character.isLetter(num.charAt(i))){
                res=num.charAt(i)+res;
            }
        }
        if (res.toLowerCase().equals((num.replaceAll("\\s","")).toLowerCase())){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
        // System.out.println((num.replaceAll("\\s","")).toLowerCase());
    }
}
