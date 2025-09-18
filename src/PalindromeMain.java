//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PalindromeMain {
    public static void main(String[] args) {
        String word = GetInput.getInput();
        // Check if palindrome and print result
        boolean isPalindrome = PalindromeLogic.isPalindrome(word);

        if (isPalindrome) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

    }
}