
import java.util.HashMap;
import java.util.Map;

public class Prob242 {

    public static boolean checkAnagram(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        // HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);

        for()

        return false;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        checkAnagram(s, t);

        // boolean result = checkAnagram(s, t);
        // System.out.println(result);
    }
}
