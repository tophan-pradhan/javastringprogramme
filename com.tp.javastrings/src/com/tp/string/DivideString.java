package com.tp.string;

import java.util.Arrays;

public class DivideString {

	public static void main(String[] args) {
		String str="aaaabbbbccccdddd";
		int len=str.length();
		int noOFpart=4;
		int p=len/noOFpart;
		int temp=0;
		String s1[]=new String[noOFpart];
		if(len%noOFpart!=0)
		{
			System.out.println("string can not be divided into "+noOFpart+" no of parts");
		}
		else
		{
			for(int i=0;i<str.length();i=i+p)
			{
				String part=str.substring(i,i+p);
				s1[temp]=part;
				temp++;
				
			}
		}
		System.out.println(Arrays.toString(s1));

	}

}
