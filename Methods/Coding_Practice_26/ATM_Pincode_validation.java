import java.util.Scanner;

class Main {

    static boolean validateAtmPinCode(String pin) {
        boolean valid = true;
        if (pin.length()>=4 && pin.length()<=6){
            for (char i: pin.toCharArray()){
                if (Character.isLetter(i)){
                    valid = false;
                    break;
                }else{
                    valid =true;
                }
            }
        }else{
            valid =false;
        }
        
        return valid;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pin = sc.nextLine();
        System.out.println((validateAtmPinCode(pin))? "Valid PIN Code" : "Invalid PIN Code");
        sc.close();
    }

}
