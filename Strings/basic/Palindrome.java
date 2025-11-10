package Strings.basic;

public class Palindrome {
    public static String reverseWords(String s) {
        // Split by spaces
        String[] words = s.trim().split("\\s+"); // regex handles multiple spaces
        
        // Reverse the array
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "  the sky  is blue  ";
        System.out.println(reverseWords(s)); // Output: "blue is sky the"
    }
}
