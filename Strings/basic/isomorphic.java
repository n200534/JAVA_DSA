package Strings.basic;

public class isomorphic {
    // Function to check if two strings are isomorphic
    // Two strings are isomorphic if the characters in one string can be replaced to get the other string
    public static boolean areIsomorphic(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        //using hashmap to store the mapping of characters
        java.util.HashMap<Character, Character> map = new java.util.HashMap<>();
        java.util.HashSet<Character> used = new java.util.HashSet<>();  // to track already mapped characters in s2

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (map.containsKey(c1)) {
                // If there is already a mapping for c1, check if it matches c2
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                // If c2 is already used for another character, return false
                if (used.contains(c2)) {
                    return false;
                }
                // Create new mapping
                map.put(c1, c2);
                used.add(c2);
            }
        }
        return true;
}
