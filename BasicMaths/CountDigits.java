public class CountDigits {
    static int count(int val) {
        return (int) Math.log10(val) + 1;
    }

    public static void main(String[] args) {
        int result = count(90);
        System.out.println(result);
    }
}