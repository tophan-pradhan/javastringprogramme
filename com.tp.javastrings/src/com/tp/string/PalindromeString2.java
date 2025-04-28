package com.tp.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeString2 {

	public static void main(String[] args) {
		String s1="madam arora is very nice";
		String arr[]=s1.split(" ");
		List<String>al=Arrays.stream(arr).filter(word->checking(word)).collect(Collectors.toList());
		System.out.println(al);

	}
	public static boolean checking(String word)
	{
		String sb1=new StringBuffer(word).reverse().toString();
		return word.equals(sb1);
	}

}
