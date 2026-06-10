import java.util.HashMap;

public class HashingValidAnagram{
    public static void main(String[] args) {
        String s = "race";
        String t = "care";

        if (isAnagram(s, t)) {
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        return map.isEmpty();
    }
}