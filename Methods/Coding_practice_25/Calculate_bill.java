import java.util.*;
import java.text.DecimalFormat;
class Main {
    static float bill(float m){
        DecimalFormat df = new DecimalFormat("#.##");
        if (m<500){
            return Float.parseFloat(df.format((float)m-(5*m)/100));
        }else if (m>=500 && m<2500){
            return Float.parseFloat(df.format((float)m-(10*m)/100));
        }else{
            return Float.parseFloat(df.format((float)m-(20*m)/100));
        }
    }
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);
        float m = s.nextInt();
        
        System.out.println(bill(m));
    }
}
