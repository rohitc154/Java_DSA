package Hashing;

public class AllCharHash {
    static void charHashing(String str) {
        int hashArr[] = new int[256];
        int len = str.length();
        int i = 0;
        while (i < len) {
            int a = str.charAt(i) - 'a'; // Calculating index at which the character resides
            ++hashArr[a];
            i++;
        }
        for (int j = 0; j < hashArr.length; j++) {
            System.out.print(hashArr[j] + "  ");
        }
    }

    public static void main(String[] args) {
        String str = "aabcdxrcadkjcf";
        charHashing(str);
    }
}
