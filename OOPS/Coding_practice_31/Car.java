import java.util.Scanner;

/**
 * A Car class should have the following attributes
 * 
 * Attributes
 * color (String), maxSpeed (int), acceleration (int), tyreFriction (int)
 *
 * Parameters for the Car class constructor should be in the same order as above 
 *
 * Implement the Car class appropriately
 */

class Car {
    String color;
    int maxSpeed;
    int acceleration;
    int tyreFriction;
    Car(String color,int maxSpeed,int acceleration,int tyreFriction){
        this.color=color;
        this.maxSpeed=maxSpeed;
        this.acceleration=acceleration;
        this.tyreFriction=tyreFriction;
    }
}

/**
* You need not change any code below.
*/

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car =  new Car(input.next(), input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println(car.color);
        System.out.println(car.maxSpeed);
        System.out.println(car.acceleration);
        System.out.println(car.tyreFriction);
        input.close();
    }
}
