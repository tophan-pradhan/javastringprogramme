package com.tp.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MaxMinOccuringWord {

	public static void main(String[] args) {
		String str="Ram is good boy but he is very very very Naughty naughty";
		String wordArray[]=str.split(" ");
		List<String>wordList=Arrays.asList(wordArray);
		Set<String>uniqueWord=new HashSet<>(wordList);
		String maxWord=" ";
		String minWord=" ";
		int maxFreq=0;
		int minFreq=Integer.MAX_VALUE;
		//counting frequencies
		Map<String, Integer> freqMap = new HashMap<>();
        for (String word : wordArray) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        System.out.println("Duplicate words:");
		for(String word:uniqueWord)
		{
			int frequency=0;
			for(String w:wordList)
			{
				if(w.equals(word))
				{
					frequency++;
				}
			}
			if (frequency > 1) {
                System.out.println("'" + word + "' appears " + frequency + " times");
            }
			if(frequency>maxFreq)
			{
				maxFreq=frequency;
				maxWord=word;
			}
			if(frequency<minFreq)
			{
				minFreq=frequency;
				minWord=word;
			}
		}
		System.out.println(" Frequencies of each word is :: "+freqMap);
		System.out.println("maximum occuring word is: "+maxWord+" :with frequency:: "+maxFreq);
		System.out.println("minimum occuring word is: "+minWord+" :with frequency:: "+minFreq);

		

	}

}
