package com.tp.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedChar(input);
        if (result != 0) {
            System.out.println("First non-repeated character is: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        // Count characters
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeated character
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0; // 0 means no unique character found
    }
}
