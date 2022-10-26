import java.util.Scanner;

/**
 * A Human class is an abstract class with the following non-static attributes and methods.
 *
 * Attributes
 * - age (int)
 *
 * Methods
 * - walk, run, eat, sleep
 *   All of the above given methods are abstract and are of void return type.
 * 
 * A SuperHero class is an abstract class with the following methods.
 *
 * Methods
 * - rescue, attack
 *   All of the above given methods are abstract and are of void return type.
 *
 * A SpiderMan class contain the following methods.
 *
 * Methods
 * - walk: When this method is called, it should print "Walking..."
 * - run: When this method is called, it should print "Running..."
 * - eat: When this method is called, it should print "Eating..."
 * - sleep: When this method is called, it should print "Sleeping..."
 * - rescue: When this method is called, it should print "Jumped into the building and saved..."
 * - attack: When this method is called, it should print "Fired the sticky web and caught"
 * 
 * The constructor of this class should contain age as a parameter and set this age value to the age attribute in the Human class.
 *
 * Implement the following classes accordingly.
 */

abstract class Human {
    int age;
    
    abstract void walk();
    abstract void run();
    abstract void eat();
    abstract void sleep();
}

abstract class SuperHero extends Human{
    abstract void rescue();
    abstract void attack();
}

class SpiderMan extends SuperHero{
    SpiderMan(int age){
        this.age=age;
    }
   void walk(){
       System.out.println("Walking...");
   }
   void run(){
       System.out.println("Running...");
   }
   void eat(){
       System.out.println("Eating...");
   }
   void sleep(){
       System.out.println("Sleeping...");
   }
   void rescue(){
       System.out.println("Jumped into the building and saved...");
   }
   void attack(){
       System.out.println("Fired the sticky web and caught...");
   }
}

/**
* You need not change any code below.
*/

class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in); 
        SuperHero spiderMan = new SpiderMan(input.nextInt()); // Passing age as argument
        System.out.println(spiderMan.age); // Should print the age => 20
        spiderMan.walk(); // Should print "Walking..."
        spiderMan.run(); // Should print "Running..."
        spiderMan.eat(); // Should print "Eating..."
        spiderMan.sleep(); // Should print "Sleeping..."
        spiderMan.rescue(); // Should print "Jumped into the building and saved..."
        spiderMan.attack(); // Should print "Fired the sticky web and caught..."
        input.close();
    }
}
