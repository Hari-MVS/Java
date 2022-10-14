import java.util.Scanner;

class Main {

    static String getWeatherReport(int temp) {
        if (temp <22){
            return "Cold";
        }else if (temp >=22 && temp<35){
            return "Warm";
        }else{
            return "Hot";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        System.out.println(getWeatherReport(temp));

        sc.close();
    }

}
