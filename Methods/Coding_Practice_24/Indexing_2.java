import java.util.Scanner;

class Main {
    
    static Character Indexing(String word, int index) {
        return word.charAt(index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int index = sc.nextInt();
        System.out.println(Indexing(word,index));
        sc.close();
    }

}
