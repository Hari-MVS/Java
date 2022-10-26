import java.util.Scanner;

/**
* Vehicle class should have the following attributes & methods.
*
* Attributes:
* name (String), topSpeed (int), makeYear (int), fuelType (String)
*
* All of the above mentioned attributes should be defined as private attributes
*
* Implement the getter and setter methods accordingly to access and update these private attributes
*
* Setter and Getter Methods
* setName(), getName(), setTopSpeedMPH(), getTopSpeedMPH(), setMakeYear(), getMakeYear(), setFuelType(), getFuelType()
*
* Implement the Vehicle class appropriately
*/

class Vehicle {
   private String name;
   private int topSpeed;
   private int makeYear;
   private String fuelType;
   
   public String getName(){
       return name;
   }
   public int getTopSpeedMPH(){
       return topSpeed;
   }
   public int getMakeYear(){
       return makeYear;
   }
   public String getFuelType(){
       return fuelType;
   }
   public void setName(String vehicleName){
       name=vehicleName;
   }
   public void setTopSpeedMPH(int vehicleTop){
       topSpeed=vehicleTop;
   }
   public void setMakeYear(int vehicleYear){
       makeYear=vehicleYear;
   }
   public void setFuelType(String vehicleFuel){
       fuelType=vehicleFuel;
   }
}

/**
* You need not change any code below.
*/

class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        Vehicle vehicle =  new Vehicle();
        vehicle.setName(input.next()); // Should set the name of the vehicle
        System.out.println(vehicle.getName()); // Should print the name of the vehicle => Audi
        vehicle.setTopSpeedMPH(input.nextInt()); // Should set the top speed of the vehicle
        System.out.println(vehicle.getTopSpeedMPH()); // Should print the top speed of the vehicle => 250
        vehicle.setMakeYear(input.nextInt()); // Should set the manufacturing year of the vehicle
        System.out.println(vehicle.getMakeYear()); // Should print the manufacturing year of the Vehicle => 2022
        vehicle.setFuelType(input.next()); // Should set the fuel type of the vehicle
        System.out.println(vehicle.getFuelType()); // Should print the fuel type of the vehicle => Diesel
    }
}
