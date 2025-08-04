package Basics;

import java.util.HashMap;

public class hashing {
    public static void main(String []args){
        int []arr={2,5,6,8,9,10};
        HashMap<Integer,Integer> freqMap=new HashMap<>();
        for (int num:arr){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1 );

        }

        for(int key:freqMap.keySet()){
            System.out.println(key +" appears "+freqMap.get(key)+" times ");
        }
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int mostFreqElement = -1;
        int leastFreqElement = -1;

        for (int key : freqMap.keySet()) {
            int value = freqMap.get(key);

            if (value > maxFreq) {
                maxFreq = value;
                mostFreqElement = key;
            }

            if (value < minFreq) {
                minFreq = value;
                leastFreqElement = key;
            }
        }
        System.out.println("Most Frequent Element: " + mostFreqElement + " (occurs " + maxFreq + " times)");
        System.out.println("Least Frequent Element: " + leastFreqElement + " (occurs " + minFreq + " times)");

    }
}
