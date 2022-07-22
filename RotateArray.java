package Arraysdsa;

import java.util.Arrays;

 
public class RotateArray{
	public static void main(String[] args) {
		 int nums[]= {1,2,3,4,5,6,7};
		 int k=3;
		 for(int i=0;i<k;i++) {
			 int len=nums.length;
			 int lastelement=nums[len-1];
			 for(int j=len-1;j>0;j--) {
				 nums[j]=nums[j-1];
			 }
			 nums[0]=lastelement;
		 }
		 System.out.println((Arrays.toString(nums)));
		  

}
	}
