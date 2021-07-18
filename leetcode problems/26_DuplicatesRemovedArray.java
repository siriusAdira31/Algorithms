
/*
26. Remove Duplicates from Sorted Array
Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

e.g.1
Input: nums = [1,1,2]
Output: 2, nums = [1,2]
Explanation: Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length


e.g.2
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4]
Explanation: Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively. It doesn't matter what values are set beyond the returned length.
*/


class DuplicatesRemovedArray 
{
    public int removeDuplicates(int[] nums) 
    {
        
        if(nums.length == 0)
            return 0;
        
        int uniqueIdx=0;
        for(int idx=0;idx<nums.length;idx++){
            if(nums[uniqueIdx] != nums[idx]){
                uniqueIdx++;
                nums[uniqueIdx] = nums[idx];
            }
        }
        return uniqueIdx+1;
    }
}