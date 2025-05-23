public class Armstrong {
    static boolean isArmstrong(int val) {
        int oValue = val;
        int sum = 0;
        int count = countNum(val);
        while (val > 0) {
            int temp = val % 10;
            sum += Math.pow(temp, count);
            val /= 10;
        }
        if (sum == oValue)
            return true;
        return false;
    }

    static int countNum(int val) {
        return (int) Math.log10(val) + 1;
    }

    public static void main(String[] args) {
        boolean result = isArmstrong(1593);
        System.out.println(result);
    }
}
