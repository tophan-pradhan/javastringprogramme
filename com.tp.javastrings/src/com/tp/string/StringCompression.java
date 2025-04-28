package com.tp.string;

public class StringCompression {

    public static void main(String[] args) {
        String input = "aaabbcddd";
        String compressed = compressString(input);
        System.out.println("Compressed String: " + compressed);
    }

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                sb.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        // Append the last character and count
        sb.append(currentChar).append(count);

        return sb.toString();
    }
}