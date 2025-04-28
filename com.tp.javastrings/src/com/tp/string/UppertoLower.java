package com.tp.string;

public class UppertoLower {

    public static void main(String[] args) {
        String str = "Tophan";
        StringBuffer sb1 = new StringBuffer(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase by subtracting 32 from ASCII value
                sb1.setCharAt(i, (char)(ch - 32));
            } else if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase by adding 32 to ASCII value
                sb1.setCharAt(i, (char)(ch + 32));
            }
        }
        System.out.println(sb1);
    }
}