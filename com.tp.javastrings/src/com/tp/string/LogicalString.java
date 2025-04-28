package com.tp.string;

public class LogicalString {

	public static void main(String[] args) {
		String str="Tophan Pradhan";
		String wordArray[]=str.split(" ");
		StringBuilder output=new StringBuilder();
		for(String word:wordArray)
		{
			StringBuilder reverseWord=new StringBuilder(word);
			output.append(reverseWord.reverse()).append(" ");
		}
		System.out.println("output : "+output.toString());
	}

}
