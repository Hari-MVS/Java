import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        boolean n = false;
        int i;
        for (i=0;i<=num.length()-1;i++){
            if (Character.isUpperCase(num.charAt(i))){
                n=true;
            }
        }
        System.out.println((n)? "Valid Password" : "Invalid Password");
    }
}
