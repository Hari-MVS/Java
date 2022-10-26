import java.util.Scanner;

/**
* Car class should have the following attributes & methods.
*
* Attributes:
* color (String), maxSpeed (int), acceleration (int), tyreFriction (int), isEngineStarted (boolean)
*
* Methods:
*   startEngine: When this method is called, set the value of attribute isEngineStarted to true which indicates that the car engine is turned on.
*   stopEngine: When this method is called, set the value of attribute isEngineStarted to false which indicates that the car engine is turned off.
*
* When a new car is created, the engine should be off by default
*
* Implement the Car class appropriately
*/


class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    boolean isEngineStarted;
    
    Car(String carColor, int carMaxSpeed, int carAcceleration, int carTyreFriction) {
       color =carColor;
       maxSpeed=carMaxSpeed;
       acceleration=carAcceleration;
       tyreFriction=carTyreFriction;
       isEngineStarted=false;
    }
    
    void startEngine() {
        isEngineStarted= true;
    }
    
    void stopEngine() {
        isEngineStarted=false;
    }
}

/**
* You need not change any code below.
*/

class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Car car =  new Car(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println(car.isEngineStarted); // Initially Car engine is off => false
        car.startEngine();
        System.out.println(car.isEngineStarted); // Car engine started => true
        car.stopEngine();
        System.out.println(car.isEngineStarted); // Car engine stopped => false
        input.close();
    }
}
