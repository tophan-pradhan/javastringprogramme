package com.tp.string;

public class UppertoLowerAndViceversa {

	public static void main(String[] args) {
		String str="Tophan";
		StringBuffer sb1=new StringBuffer(str);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97&&str.charAt(i)<=122)
			{
				sb1.setCharAt(i,Character.toUpperCase(str.charAt(i)));
			}
			else if(str.charAt(i)>=65&&str.charAt(i)<=90)
			{
				sb1.setCharAt(i,Character.toLowerCase(str.charAt(i)));
			}
		}
		
		System.out.println(sb1);

	}

}
