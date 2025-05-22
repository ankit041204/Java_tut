public class Recursion4 {
    public static int first = -1;
    public static int last = -1;

    // 🔧 Fixed typo: 'Sring' -> 'String'
    public static void findOccurance(String str, int idx, char element) {
        // ✅ Base case: end of string
        if (idx == str.length()) {
            System.out.print(first);
            System.out.println(last);
            return;
        }

        // 🔧 Fixed variable declaration typo: 'charcurrChar' -> 'char currChar'
        char currChar = str.charAt(idx);

        // 🔧 Fixed capitalization: 'CurrChar' -> 'currChar'
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        // ✅ Recursive call
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abhsreaygsws";
        findOccurance(str, 0, 'g');
    }
}
