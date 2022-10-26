import java.util.Scanner;

/**
 * A mobile class should have the following methods.
 * 
 * Methods:
 * createContact
 * 
 * Scenario 1 (Person with single contact number)
 *      - Define createContact method which takes name (String) and the phone number (long) as arguments
 *        and print name and the phone number each in a new line
 *
 * Scenario 2 (Person with two contact numbers)
 *      - Define another method with same name createContact which takes name and two phone numbers as arguments
 *        and print name and the two phone numbers each in a new line
 *   
 * Implement the mobile class appropriately
 */

class Mobile {
    void createContact(String name,long phone){
        System.out.println(name);
        System.out.println(phone);
    }
    void createContact(String name,long phone,long number){
        System.out.println(name);
        System.out.println(phone);
        System.out.println(number);
    }
}

class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        Scanner input = new Scanner(System.in);
        mobile.createContact(input.next(), input.nextLong());
        mobile.createContact(input.next(), input.nextLong(), input.nextLong());
        input.close();
    }
}


