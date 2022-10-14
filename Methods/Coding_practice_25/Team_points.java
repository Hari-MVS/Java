import java.util.Scanner;

class Main {

    static void calculateLeaguePoints(int a, int b, int c) {
        int points = ((a*4)+(b*2))-(c*1);
        System.out.println(points);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String scores = sc.nextLine();
        String[] nums = scores.split(",");
        int n = nums.length;
        int[] numb = new int[n];
        for (int i = 0; i < n; i++) {
            numb[i] = Integer.parseInt(nums[i]);

        }
        calculateLeaguePoints(numb[0],numb[1],numb[2]);

        sc.close();
    }

}
