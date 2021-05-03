
/*
1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
______________________________________________________________________________
Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
______________________________________________________________________________
Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
*/

class RunningSumArray {
    public int[] runningSum(int[] nums) {
        
        if(nums.length == 1)
            return nums;
        
        for(int idx=0;idx<nums.length;idx++){
            if(idx == 0)
                continue;
            
            nums[idx] +=nums[idx-1];
        }
        
        return nums;
    }
}