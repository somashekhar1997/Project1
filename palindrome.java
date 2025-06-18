package loop;
public class palindrome {

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("Is palindrome: " + isPalindrome(input));
    }

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
