import java.util.*;

public class PalindromeCheck {

    public static boolean checkPalindrome(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i))
                return false;
        }
        return true;
    }

    public static String checkPalindromeByRecursion(String str) {
        if (str == null || str.isEmpty())
            return str;

        int length = str.length();
        return str.charAt(length - 1) + checkPalindromeByRecursion(str.substring(0, length - 1));
    }

    // Main method
    public static void main(String[] args) {
        // Input a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your input: ");
        String text = input.nextLine();
        input.close();

        System.out.println("Is palindrome: " + checkPalindrome(text));

        String reverseStr = checkPalindromeByRecursion(text);
        if (text.equals(reverseStr))
            System.out.println("The string is palindrome (Reverse)");
        else
            System.out.println("The string is not palindrome (Reverse)");
    }

}
