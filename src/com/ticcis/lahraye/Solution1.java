package com.ticcis.lahraye;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	 
	    public static List<Integer> changeStateAfter(int[] param, int days) {
	    	int[] resultArray = new int[8];
	    	List<Integer> resultArrayList = new ArrayList<>();
	    	int prev = 0;
			int next = 0;
			int currVal = 0;
			
			if((days != 0) ) {
				for(int j = 0; j < param.length; j++) {
					if(j == 0) {
						prev = 0;
						next = param[j+1];
					}
					else {
						prev = param[j-1];	
						if(j == (param.length -1)) {
							next = 0;
						}
						else {
							next = param[j+1];
						}
					}
					currVal = prev == next ? 0 : 1;
					resultArray[j] = currVal;
				}
			}
			days--;
			
			if(days != 0) { 
				resultArrayList = changeStateAfter(resultArray,days);
				}
			else {
				for(int val : resultArray) {
					resultArrayList.add(val);
				}
			}
			
			
			return resultArrayList;
	}
	
	private static boolean neighbourMatches(int prev, int next) {
		return prev == next;
	}

	public static void main(String[] args) {
//		int[] result = changeStateAfter(new int[]{1,0,0,0,0,1,0,0},1);
		List<Integer> result = changeStateAfter(new int[]{1,1,1,0,1,1,1,1},2);
//		int[] result = changeStateAfter(new int[]{1,0,1,0,1,0,0,1},1);
//		for(int i : result) {
			System.out.println("-"+result);
//		}
	}
}
