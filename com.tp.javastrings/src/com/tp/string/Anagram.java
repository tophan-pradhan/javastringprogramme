package com.tp.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="MadaM";
		String s2="adMam";
		if(s1.length()!=s2.length())
		{
			System.out.println("both strings are not angram");
		}
		else
		{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char arr1[]=s1.toCharArray();
			char arr2[]=s2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2)==true)
			{
				System.out.println("both the strings are anagram");
			}
			else
			{
				System.out.println("both strings are not angram");
			}
		}

	}

}
