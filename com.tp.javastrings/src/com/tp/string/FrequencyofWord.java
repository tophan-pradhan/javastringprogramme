package com.tp.string;

import java.util.HashMap;
import java.util.Map;


public class FrequencyofWord {

	public static void main(String[] args) {
		 String str = "Ram is good boy but he is very very very Naughty naughty";

	        // Convert to lowercase and split
	        String[] words = str.toLowerCase().split(" ");

	        // Map to store word frequencies
	        Map<String, Integer> wordFreq = new HashMap<>();

	        // Count frequencies
	        for (String word : words) {
	            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
	        }

	        // Print all word frequencies
	        System.out.println("Word Frequencies:");
	        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
	            System.out.println(entry.getKey() + " : " + entry.getValue());
	        }

	        // Print duplicates
	        System.out.println("\nDuplicate Words:");
	        for (Map.Entry<String, Integer> entry : wordFreq.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " : " + entry.getValue());
	            }
	        }
	}

}
