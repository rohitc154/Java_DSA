public class PrimeFactor {
    public static int calculate(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                count++;
                System.out.println(i);
                i = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int val = calculate(27);
        // System.out.println(val);
    }
}
