public class Gcd {

    // -------------------:)) First Way :
    static int findGCD(int val1, int val2) {
        int min;
        int gcd = 0;
        if (val1 < val2)
            min = val1;
        else
            min = val2;
        for (int i = 1; i <= min; i++) {
            if (val1 % i == 0 && val2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // -----------------------:)) Second Way :
    static int gcd2(int val1, int val2) {
        int min;
        int gcd = 0;
        if (val1 < val2)
            min = val1;
        else
            min = val2;
        for (int i = min; i > 1; i--) {
            if (val1 % i == 0 && val2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    // ---------------------:)) Third Way ! (Euclidean Algorithm)
    /*
     * Euclidean Algorithm Says :
     * gcd(a,b) = gcd(a - b, b), where a > b --> This is good but, not that much
     * efficient. So, we can do what is :
     * gcd(a,b) = gcd(a % b, b), where a > b
     */
    static void gcdEfficient(int num1, int num2) {
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2)
                num1 = num1 % num2;
            else
                num2 = num2 % num1;
        }

        if (num1 == 0) {
            System.out.println(num2);
        } else
            System.out.println(num1);
    }

    public static void main(String[] args) {
        // int result = findGCD(40, 120);
        // System.out.println("GCD : " + result);

        // int result = gcd2(40, 120);
        // System.out.println("GCD : " + result);

        gcdEfficient(9, 12);
    }
}