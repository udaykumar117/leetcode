package array;

import java.util.Arrays;

/*Given an integer array nums of length n, you want to create an array ans of length 2n where 
 * ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:

Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]*/
public class Concatentaion_1929 {
	public static void main(String args[]) {
		//method1
		int[] a = {1,2,4};
//		int[] res = new int[2*a.length];
//		
//		System.arraycopy(a, 0, res, 0, a.length);
//		System.arraycopy(a, 0, res, a.length, a.length);
//		System.out.println(Arrays.toString(res));
		//method2
		Concatentaion_1929 c = new Concatentaion_1929();
		int[] res =  c.getConcatenation(a);
		System.out.println(Arrays.toString(res));
	}
	 public int[] getConcatenation(int[] nums) {
	        int[] ans = new int[nums.length*2];
	        int len = nums.length;
	        int i= 0;
	        
	        while(i<len)
	        {
	            ans[i] = nums[i];
	            ans[i+len] = nums[i];
	            i++;
	        }
	        return ans;
	    }
}
