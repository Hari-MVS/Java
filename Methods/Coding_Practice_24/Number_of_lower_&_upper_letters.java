import java.util.*;
class Main {

    static void CountOfLowercaseAndUppercaseLetters(String str)
    {
        int up =0;
        int lo =0;
        for (int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                up+=1;
            }else{
                lo+=1;
            }
        }
        System.out.println(up);
        System.out.println(lo);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);      
        String chars= sc.nextLine();
        CountOfLowercaseAndUppercaseLetters(chars);

        sc.close();
    }
    
}
