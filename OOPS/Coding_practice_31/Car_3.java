import java.util.Scanner;

/**
* Car class should have the following attributes & methods
*
* Attributes:
* color (String), maxSpeed (int), acceleration (int), tyreFriction (int), isEngineStarted (boolean), currentSpeed (int)
*
* Methods:
* startEngine, stopEngine, accelerate
*
* accelerate Method
* When this method is called, 
*   If car engine is off, the current speed of the car should not increase
*   If car engine is on, the current speed of the car should increase according to its acceleration value
*   print the message "Car has not started yet" if the car engine is off
*   Any car cannot accelerate more than its maxSpeed
*
* When a new car is created, the engine should be off by default and current speed should be 0
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
      if (isEngineStarted){
          if(currentSpeed<maxSpeed )
                currentSpeed+=acceleration;
      }else{
          System.out.println("Car has not started yet");
      }
    }
}

/**
* You need not change any code below.
*/

class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Car car =  new Car(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
        car.accelerate(); // Calling the accelerate method when isEngineStarted is false
        // The above line will print "Car has not started yet"
        System.out.println(car.currentSpeed);
        car.startEngine(); // Starting the car engine
        System.out.println(car.currentSpeed); // Car engine is started but not yet accelerated => 0
        car.accelerate(); // Calling the accelerate method when the isEngineStarted is true
        System.out.println(car.currentSpeed); // currentSpeed value is increased by acceleration value (0 + 10 => 10) 
        car.accelerate();
        System.out.println(car.currentSpeed); // currentSpeed value is increased by acceleration value (10 + 10 => 20) 
        car.accelerate(); // Calling the accelerate method when the isEngineStarted is true
        car.accelerate(); 
        car.accelerate(); 
        System.out.println(car.currentSpeed); // currentSpeed value is increased by acceleration value (20 + 10 + 10 + 10 => 50) 
        car.accelerate(); // Accelerating the car more than its maxSpeed
        System.out.println(car.currentSpeed); // Any car cannot accelerate more than its maxSpeed => 50 
        input.close();
    }
}
