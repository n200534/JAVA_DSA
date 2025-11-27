package recursion.lec2;

public class powerset {
    // Generate the power set of a given set using recursion
    public static void generatePowerSet(String str) {
        List<String> result = new java.util.ArrayList<>();
        generateHelper("", str, 0, result);
        return result;
    }

    private static void generateHelper(String current, String str, int index, List<String> result) {
        if (index == str.length()) {
            result.add(current);
            return;
        }
        // Include the current character
        generateHelper(current + str.charAt(index), str, index + 1, result);
        // Exclude the current character
        generateHelper(current, str, index + 1, result);
    }
}
