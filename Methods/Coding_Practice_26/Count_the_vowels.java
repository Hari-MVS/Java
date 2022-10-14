import java.util.Scanner;

class Main {
    static int countTheVowels(String s)
    {
        int count =0;
        char [] vow={'a','i','o','e','u'};
        for (char i:s.toCharArray()){
            for (char j:vow){
                if (i==j){
                    count+=1;
                }
            }
        }
        return count;
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countTheVowels(s));

        sc.close();
    }
}
