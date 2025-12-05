package recursion.lec3;

public class palindromepartition {
      boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
    void backtrack(String s, int start, java.util.List<String> current, java.util.List<java.util.List<String>> result) {
        if (start >= s.length()) {
            result.add(new java.util.ArrayList<>(current));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                current.add(s.substring(start, end + 1));
                backtrack(s, end + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
    List<List<String>> partition(String s) {
        List<List<String>> result = new java.util.ArrayList<>();
        backtrack(s, 0, new java.util.ArrayList<>(), result);
        return result;
    } 
}
 