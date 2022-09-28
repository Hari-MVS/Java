import java.util.Scanner;
class Main {
    public static void main(String[] args) { 
        Scanner N = new Scanner(System.in);
        int m= N.nextInt();
        System.out.println(m/365);
        System.out.println((m-(m/365)*365)/7);
        System.out.println((m-(m/365)*365)-((m-(m/365)*365)/7)*7);
    }
}
// year =(n//365)
// print(year)
// week = n-year*365 
// print(week//7)
// print(week - (week//7)*7)
