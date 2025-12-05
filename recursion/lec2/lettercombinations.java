package recursion.lec2;

import java.util.ArrayList;
import java.util.List;

public class lettercombinations {
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.length() == 0) return result;

        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int index, String digits, StringBuilder path, List<String> result) {
        
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            path.append(c);                      // PICK
            backtrack(index + 1, digits, path, result);
            path.deleteCharAt(path.length() - 1); // UN-PICK (backtrack)
        }
    }
}
