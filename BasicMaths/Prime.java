public class Prime {
    static void isPrime(int val) {
        int count = 0;
        for (int i = 1; i * i <= val; i++) {
            if (val % i == 0) {
                count++;
                if ((val / i) != i)
                    count++;
            }
        }
        if (count == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    public static void main(String[] args) {

        isPrime(1);
    }
}
