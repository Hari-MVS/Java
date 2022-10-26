import java.util.Scanner;

/**
 * A Shape class should contain the following abstract methods 
 * Abstract Methods
 *   area (This method returns int value)
 *   perimeter (This method returns int value)
 * 
 * A Rectangle class should contain the following non-static attributes and methods.
 *
 * Attributes
 *   length (int), breadth (int)
 *   Both of the attributes will be parameters to the constructor.
 * 
 * Overriding Methods
 *   area: This method returns the area of the rectangle.
 *   perimeter: This method returns the perimeter of the rectangle.
 *
 * Implement the Shape and Rectangle classes accordingly.
 */


abstract class Shape {
    abstract int area();
    abstract int perimeter();
}

class Rectangle extends Shape{
    int length;
    int breadth;
    
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
}

/**
* You need not change any code below.
*/

class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Shape shape = new Rectangle(input.nextInt(), input.nextInt());
        System.out.println(shape.area()); // Should print area of the rectangle => 20
        System.out.println(shape.perimeter()); // Should print perimeter of the rectangle => 18
        input.close();
    }
}
