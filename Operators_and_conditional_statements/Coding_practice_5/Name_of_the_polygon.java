import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();

        if (m<3){
            System.out.println("Not Polygon");
        }else if(m==3){
            System.out.println("Triangle");
        }else if(m==4){
            System.out.println("Quadrilateral");
        }else if(m==5){
            System.out.println("Pentagon");
        }else{
            System.out.println("Big Polygon");
        }
    }
}
