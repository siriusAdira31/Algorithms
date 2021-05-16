/*
1470. Shuffle the Array : 
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
_______________________________________________________________________________
Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]
_________________________________________________________________________________
Example 3:
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]
_______________________________________________________________________________
Constraints:
1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
*/

public class ShuffledArray{


	// Solution 1 : Use extra Array to store - O(n) , space - O(n)
	public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
		
		int start = 0;
		int half = n;
		
		for(int idx=0;idx<nums.length-1;){
			result[idx++] = nums[start++];
			result[idx++] = nums[n++];
		}
		return result;
    }
	
	// Solution 1 : In place shuffling  - o(n) , space = O(1)
    public int[] shuffleInPlace(int[] nums, int n) {
        int firstHalfIdx = 0;
        int nextHalfIdx = nums.length/2;
        int max = Integer.MIN_VALUE;
        for(int idx=0;idx<nums.length;idx++){
            if(max < nums[idx])
                max = nums[idx];
        }
        
        max+=1;
        
        for(int idx=0;idx<nums.length;idx++){
            if(idx%2 == 0)
                nums[idx] += (nums[firstHalfIdx++] % max) * max;
            else
                nums[idx] += (nums[nextHalfIdx++] % max) * max;
        }
        
        for(int idx=0;idx<nums.length;idx++){
            nums[idx]/=max;
        }
        
        return nums;
    }

}