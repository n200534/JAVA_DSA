package recursion.lec2;

import java.util.List;

public class binaryStrings {
    // Generate all binary strings of length n using recursion
    public static void generateBinaryStrings(int n) {
        List<String> result = new java.util.ArrayList<>();
        generateHelper("", n,result);
        return result;
    }
    private static void generateHelper(String current, int n, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        generateHelper(current + "0", n, result);
        generateHelper(current + "1", n , result);
    }

    //with no consecutive 1s
    public static void generateBinaryStringsNoConsecOnes(int n) {
        List<String> result = new java.util.ArrayList<>();
        generateNoConsecOnesHelper("", n, result);
        return result;
    }
    private static void generateNoConsecOnesHelper(String current, int n, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        generateNoConsecOnesHelper(current + "0", n, result);
        if (current.length() == 0 || current.charAt(current.length() - 1) != '1') {
            generateNoConsecOnesHelper(current + "1", n, result);
        }
    }

    //with equal number of 0s and 1s
    public static void generateBinaryStringsEqual01(int n) {
        List<String> result = new java.util.ArrayList<>();
        generateEqual01Helper("", n, 0, 0, result);
        return result;
    }
    private static void generateEqual01Helper(String current, int n, int count0, int count1, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        if (count0 < n / 2) {
            generateEqual01Helper(current + "0", n, count0 + 1, count1, result);
        }
        if (count1 < n / 2) {
            generateEqual01Helper(current + "1", n, count0, count1 + 1, result);
        }
    }


}
