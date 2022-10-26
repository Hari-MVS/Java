import java.util.Scanner;

/**
* A Watch interface should consist of the following abstract method.
*  
* Abstract Methods
* - displayTime
* 
* A Smartwatch is a watch so the Smartwatch interface should inherit Watch interface.
* It should consists of following abstract methods.
* 
* Abstract Methods
* - makeCall
* - displayHeartRate
*
* The IWatch class implements Smartwatch interface and it should consist of following method Implementations
* 
* Methods          
* - displayTime
*   This method should take 3 values hours (int), minutes (int), seconds (int) as arguments and print the time in the following format
*   For example if 5, 30, 30 are the inputs then it should print "5:30:30"
* 
* - makeCall
*   This method should take a single value mobileNum (long) as argument and print mobileNum in the following format
*   For example if 80808080 is the input then it should print "Calling...80808080"
*
* - displayHeartRate
*   This method takes a single value heartRate (int) as argument and print heartRate in the following format
*   For example if 80 is the input then it should print "Heart Rate: 80 bpm"
*
* Implement the interfaces and the class accordingly
*/


interface Watch {
    void displayTime(int hours,int minutes,int seconds); 
}

interface Smartwatch extends Watch {
    void makeCall(long num);
    void displayHeartRate(int num);
}

class IWatch implements Smartwatch{
   public void displayTime(int hours,int minutes,int seconds){
       System.out.printf("%d:%d:%d",hours,minutes,seconds);
       System.out.println();
   }
   public void makeCall(long num){
       System.out.printf("Calling...%d", num);
       System.out.println();
   }
   public void displayHeartRate(int num){
       System.out.printf("Heart Rate: %d bpm", num);
   }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        IWatch iWatch = new IWatch();
        iWatch.displayTime(input.nextInt(), input.nextInt(), input.nextInt()); // Should print "14:20:30"
        iWatch.makeCall(input.nextLong()); // Should print "Calling...98989898"
        iWatch.displayHeartRate(input.nextInt()); // Should print "Heart Rate: 96 bpm"
        input.close();
    }
}
