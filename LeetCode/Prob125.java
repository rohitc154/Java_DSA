
public class Prob125 {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if (Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }

            if (Character.isLetterOrDigit(r)) {
                right++;
                continue;
            }

            if (l != r) {
                return false;
            }

            left++;
            right++;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));

    }
}
