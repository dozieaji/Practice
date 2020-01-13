package com.ticcis.lahraye;

public class Solution2 {

    static int gcd(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
	    public static int generalizedGCD(int n, int[] arr)
	    {
	       int result = arr[0]; 
	        for (int i = 1; i < n; i++){ 
	            result = gcd(result, arr[i]); 
	  
	            if(result == 1) 
	            { 
	               return 1; 
	            } 
	        } 
	  
	        return result; 
	    } 
	    
	    public static void main(String[] args) 
	    { 
	        int arr[] = { 2, 4, 6, 8, 10 }; 
	        int n = arr.length; 
	        System.out.println(generalizedGCD(n, arr)); 
	    } 
	    
	   
	}