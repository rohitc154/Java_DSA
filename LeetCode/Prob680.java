public class Prob680 {
    static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if (l != r) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean checkPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "amadfama";

        boolean result = checkPalindrome(s);
        System.out.println(result);
    }
}
