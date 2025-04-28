package com.tp.string;

public class MaxLengthWord {

	public static void main(String[] args) {
		String str="A boy Named Tophan";
		String arr[]=str.split(" ");
		
		String maximum=arr[0];
        String minimum=arr[0];
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i].length()>maximum.length())
    	   {
    		  maximum=arr[i];
    	   }
    	   if(arr[i].length()<minimum.length())
    	   {
    		   minimum=arr[i];
    	   }
       }
       System.out.println("mximum string:: "+maximum);
       System.out.println("minimum string:: "+minimum);
		
	}

}
