package Arraysdsa;

import java.util.Arrays;

public class Problme4 {
	

		public static void main(String[] args) {
			 int arr1[]= {1,3,5,6};
			 int target=7;
			   
			 System.out.print(retindex(arr1,target));
	 
		}

	 
		public static int retindex(int[] arr1,int target) {
			 
			 
			for(int i=0;i<arr1.length;i++) {
				 
				 if(arr1[i]==target) {
					 return i;
				 }
				 else if(arr1[i]>target) {
					 return arr1.length + 1;
				 }
			 }
				 
			 
			return arr1.length;
		
		}

	}
