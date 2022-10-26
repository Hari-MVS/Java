import java.util.Scanner;
/**
 * Car class should have the following attributes & methods
 * 
 * Attributes
 * color (String), maxSpeed (int), acceleration (int), tyreFriction (int), isEngineStarted (boolean), currentSpeed (int)
 *
 * Methods
 * startEngine, stopEngine, accelerate, applyBrakes, soundHorn
 *
 * soundHorn Method
 *  Print "Beep Beep" if car engine is on
 *  Print "Car has not started yet" if car engine is off
 *
 * When a new car is created, the engine should be off by default and currentSpeed should be 0
 *
 * Implement the Car class appropriately
 */

class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    int currentSpeed;
    boolean isEngineStarted;
    
    Car(String carColor, int carMaxSpeed, int carAcceleration, int carTyreFriction) {
        color=carColor;
        maxSpeed=carMaxSpeed;
        acceleration=carAcceleration;
        tyreFriction=carTyreFriction;
        currentSpeed=0;
        isEngineStarted=false;

    }
    
    void startEngine() {
        isEngineStarted=true;
    }
    
    void stopEngine() {
        isEngineStarted=false;
    }
    
    void accelerate() {
        if(isEngineStarted){
            if(currentSpeed<maxSpeed){
                currentSpeed+=acceleration;
            }
        }
    }
    
    void soundHorn() {
        if(isEngineStarted){
            System.out.println("Beep Beep");
        }else{
            System.out.println("Car has not started yet");
        }
     
    }
    
    void applyBrakes() {
        if (isEngineStarted){
            currentSpeed-=tyreFriction;
            if (currentSpeed<0){
                currentSpeed=0;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Car car =  new Car(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
        car.soundHorn(); // Calling soundHorn() when the isEngineStarted is false
        car.startEngine(); // Starting the engine
        car.soundHorn(); // Calling the soundHorn() when isEngineStarted is True
    }
}
