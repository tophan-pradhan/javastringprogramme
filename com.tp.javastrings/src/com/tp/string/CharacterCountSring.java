package com.tp.string;

public class CharacterCountSring {

	public static void main(String[] args) {
		String str = "Vidyayugv#*8";
        int[] freq = new int[256]; // Array to store the frequency of each character (assuming ASCII)

        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            freq[c]++; // Increment the count for the character's ASCII value
        }

        // Print the character counts
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]>0) { // If the character has appeared at least once
                System.out.println((char) i + " : " + freq[i]);
            }
        }

	}

}
