package com.tp.string;

public class StringThreadSafety  {
    public static void main(String[] args) {
        String s = "Java"; // Shared across multiple threads
        new Thread(() -> System.out.println(s.toUpperCase())).start();
        new Thread(() -> System.out.println(s.toLowerCase())).start();
    }
}
