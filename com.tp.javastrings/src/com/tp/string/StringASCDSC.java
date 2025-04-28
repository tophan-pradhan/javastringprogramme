package com.tp.string;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class StringASCDSC {

	public static void main(String[] args) {
		String str[]= {"Tophan","shiba","Viswas","Hari"};
		
		List<String>l1=Arrays.stream(str).sorted((a,b)->{
			int a1=a.length();
			int b1=b.length();
			return Integer.compare(a1,b1);
//			if(a1<b1)
//			return -1;
//			else if(a1>b1)
//				return 1;
//			else
//				return 0;
		}).collect(Collectors.toList());
		
		System.out.println(l1);

	}

}
