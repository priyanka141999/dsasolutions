package Arraysdsa;

import java.util.Arrays;

public class MissingNumber {
	 public static int missingNumber(int[] nums) {
		 int sum=0;
	        for(int i=0;i<nums.length;i++){
	   sum=sum+nums[i];
	        }
	            int n=nums.length;
	            int expectedsum=(n*(n+1))/2;
	            
	        
	          int missingno=expectedsum-sum;
	            return missingno;
	 }
			
	 
		 
	 
	 public static void main(String[] args) {
		 int nums[]= {0,1};
		 System.out.println(missingNumber(nums));
	        
	        
	    }
	}
