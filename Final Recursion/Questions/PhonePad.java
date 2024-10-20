import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    static void pad(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';// this will convert '2' into 2
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            pad(p+ch,up.substring(1));

        }
    }
    public static List<String> letterCombinations(String p, String up) {
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';// this will convert '2' into 2
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            char ch = (char)('a'+i);
            list.addAll(letterCombinations(p+ch,up.substring(1)));
        }
        return list;
    }
    private static final String[] KEYPAD = {
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
    };

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>(); // Return empty list for empty input
        }
        return letterCombinationsRecursive("", digits);
    }

    private List<String> letterCombinationsRecursive(String combination, String remainingDigits) {
        if (remainingDigits.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(combination);
            return list;
        }

        int digit = remainingDigits.charAt(0) - '0'; // Get the current digit as an integer
        String letters = KEYPAD[digit];              // Get corresponding letters for the digit
        ArrayList<String> resultList = new ArrayList<>();

        // Loop through each character in the letters corresponding to the current digit
        for (char letter : letters.toCharArray()) {
            // Recursive call for the next digit, with the letter appended to the combination
            resultList.addAll(letterCombinationsRecursive(combination + letter, remainingDigits.substring(1)));
        }

        return resultList;
    }
    public static void main(String[] args) {
        pad("","12");
        System.out.println(letterCombinations("","12"));
    }
}
