public class Reverse {
    static int reverse(int val) {
        int reverseNum = 0;
        while (val > 0) {
            int temp = val % 10;
            reverseNum = reverseNum * 10 + temp;
            val /= 10;
        }
        return reverseNum;
    }

    public static void main(String[] args) {
        int result = reverse(43256);
        System.out.println(result);
    }
}
