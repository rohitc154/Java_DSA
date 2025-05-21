public class Palindrome {
    static boolean isPalindrome(int val) {
        int oValue = val;
        int reverseNum = 0;
        while (oValue > 0) {
            int temp = oValue % 10;
            reverseNum = reverseNum * 10 + temp;
            oValue /= 10;
        }
        if (reverseNum == val)
            return true;
        return false;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome(1241);
        System.out.println(result);
    }
}
