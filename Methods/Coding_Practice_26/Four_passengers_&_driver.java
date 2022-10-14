import java.util.Scanner;

class Main {

    static int numberOfCarsNeeded(int numOfPeople) {
        if (numOfPeople%5==0){
            return numOfPeople/5;
        }else{
            return (numOfPeople/5)+1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println(numberOfCarsNeeded(s));

        sc.close();

    }

}
