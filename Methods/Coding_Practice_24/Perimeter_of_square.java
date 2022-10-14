import java.util.*;
class Main {
    static int perimeterOfSquare(int side)
    {
        return side*4;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);      
        int side= sc.nextInt();
        System.out.println(perimeterOfSquare(side));

        sc.close();
    }
    
}
