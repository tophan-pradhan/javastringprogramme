package com.tp.string;

public class SwapingString {

	public static void main(String[] args) {
	String string1="Pradhan";
	String string2="Tophan";
	System.out.println("Before swapping:: "+string1+" "+string2);
	string1=string1+string2;
	string2=string1.substring(0,string1.length()-string2.length());
	string1=string1.substring(string2.length());
	System.out.println("After swapping :: "+string1+" "+string2);

	}

}
