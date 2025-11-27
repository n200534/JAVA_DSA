package recursion.lec2;

public class genrateparantheses {
    //Problem Statement: Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    /*
    Example 1:
    Input: n = 3
    Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]

    Example 2:
    Input: n = 1
    Output: ["()"]
    */
   public void generateParenthesis(int n) {
    List<String> result = new java.util.ArrayList<>();
    generateHelper("", 0, 0, n, result);
    return result;


    }
    private void generateHelper(String current, int open, int close, int max, List<String> result) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (open < max) {
            generateHelper(current + "(", open + 1, close, max, result);
        }
        if (close < open) {
            generateHelper(current + ")", open, close + 1, max, result);
        }
    }


}
