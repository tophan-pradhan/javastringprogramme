package com.tp.string;

public class MaxAndMinOccuringCharacter {

	public static void main(String[] args) {
		String str="TophanMugagadia";
		char arr[]=str.toCharArray();
		int freq[]=new int[256];
		for(char ch:arr)
		{
			freq[ch]++;
		}
		char maxChar='\0',minChar='\0';
		int maxFreq=0,minFreq=Integer.MAX_VALUE;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>0)
			{
				if(freq[i]>maxFreq)
				{
					maxFreq=freq[i];
					maxChar=(char)i;
				}
				if(freq[i]<minFreq)
				{
					minFreq=freq[i];
					minChar=(char)i;
				}
			}
		}
		 System.out.println("frequencies of character:: ");
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>0)
			{
			   System.out.println((char)i+" :: "+freq[i]);	
			}
		}
		System.out.println("maximum occuring character : "+maxChar+" with frequency "+maxFreq);
		System.out.println("minimum occuring character : "+minChar+" with frequency "+minFreq);

	}

}
