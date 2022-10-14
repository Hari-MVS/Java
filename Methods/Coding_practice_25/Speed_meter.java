import java.util.Scanner;

class Main {
    static String getSpeedStatus(int speed) {
        if (speed <60){
            return "Normal";
        }else if (speed >=60 && speed<80){
            return "Warning";
        }else{
            return "Over Speed";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        System.out.println(getSpeedStatus(speed));

        sc.close();
    }

}
