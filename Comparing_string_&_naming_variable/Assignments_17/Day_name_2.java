import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int target = s.nextInt();
        int targetD = 0;
        int out = 0;
        String day = "";
        if (a.equals("Monday")){
            out+=1;
        }else if (a.equals("Tuesday")){
            out+=2;
        }else if (a.equals("Wednesday")){
            out+=3;
        }else if (a.equals("Thursday")){
            out+=4;
        }else if (a.equals("Friday")){
            out+=5;
        }else if (a.equals("Saturday")){
            out+=6;
        }else if (a.equals("Sunday")){
            out+=7;
        }
        targetD = ((out+(target-1))%7);
        System.out.println((targetD==1)? "Monday" : (targetD==2)?"Tuesday" :(targetD==3)?"Wednesday": 
        (targetD==4) ? "Thursday" : (targetD==5) ? "Friday" : (targetD==6) ? "Saturday" : "Sunday");
    }
}
