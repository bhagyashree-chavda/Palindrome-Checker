import java.util.Scanner;

public class GetInput {
    private static Scanner sc = new Scanner(System.in);
    // get a word from the user
    public static String getInput() {
        System.out.print("Enter a string: ");
        String word =  sc.nextLine();
        return word.toLowerCase();
    }
}
