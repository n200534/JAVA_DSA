package Strings.basic;

public class largestodd {
    public static String largestOddNumber(String s) {
        int n = s.length();

        // Step 1️⃣: Find the endpoint — the last odd digit
        int end = -1;
        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int digit = c - '0';
            if (digit % 2 == 1) { // odd digit
                end = i;
                break;
            }
        }

        // If no odd digit found, no valid odd number exists
        if (end == -1) {
            return "";
        }

        // Step 2️⃣: Find the starting point — first non-zero digit before 'end'
        int start = 0;
        while (start <= end && s.charAt(start) == '0') {
            start++;
        }

        // Step 3️⃣: Extract substring between start and end
        if (start > end) {
            return ""; // only zeros before odd → no valid number
        }

        return s.substring(start, end + 1);
    }
}
