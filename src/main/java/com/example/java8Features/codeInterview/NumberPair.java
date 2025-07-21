package com.example.java8Features.codeInterview;

import java.util.HashMap;
import java.util.Map;

public class NumberPair {
    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1, 5, 6, 7, 8};
        int k = 10;

        Map<Integer, Integer> freqMap = new HashMap<>();
        int pairCount = 0;

        // Build frequency map
        for (int num : a) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Find pairs
        for (int num : a) {
            int complement = k - num;
            if (freqMap.containsKey(complement) && num < complement) {
                int count = freqMap.get(num) * freqMap.get(complement);
                pairCount += count;
                System.out.println("Pair found: (" + num + ", " + complement + ") x " + count);
            }
        }

        System.out.println("Total pairs found: " + pairCount);
    }
}