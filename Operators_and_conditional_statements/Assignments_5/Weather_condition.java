import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float T = s.nextFloat();
        if (T<0){
            System.out.println("Freezing weather");
        }else if ((0<=T) && (T<10)){
            System.out.println("Very Cold weather");
        }else if ((10<=T) && (T<20)){
            System.out.println("Cold weather");
        }else if ((20<=T) && (T<30)){
            System.out.println("Normal");
        }else if ((30<=T) && (T<40)){
            System.out.println("Hot");
        }else{
            System.out.println("Very Hot");
        }
    }
}
