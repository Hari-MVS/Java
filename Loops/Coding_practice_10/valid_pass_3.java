import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String num = s.nextLine();
        
        int upper=0,digit=0,lower =0;
        int i;
        for (i=0;i<=num.length()-1;i++){
            if (Character.isUpperCase(num.charAt(i))){
                upper+=1;
            }
            if (Character.isDigit(num.charAt(i))){
                digit+=1;
            }
            if (Character.isLowerCase(num.charAt(i))){
                lower+=1;
            }
        }
        System.out.println((upper>=1 && lower>=1 & digit>=1)? "Valid Password" : "Invalid Password");
    }
}
