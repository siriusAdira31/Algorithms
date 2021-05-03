/*
1512. Number of Good Pairs
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.
____________________________________________________________________
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
____________________________________________________________________
Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
____________________________________________________________________
Example 3:
Input: nums = [1,2,3]
Output: 0
*/



class Pairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> numberCount = new HashMap<Integer,Integer>();
        
        int totalPairs = 0;
        
        for(int i=0;i<nums.length;i++){
            if(numberCount.containsKey(nums[i]))
                numberCount.put(nums[i],numberCount.get(nums[i])+1);
            else
                numberCount.put(nums[i],1);
        }
        
        for(Map.Entry<Integer,Integer> numFequency : numberCount.entrySet()){
            totalPairs += ((numFequency.getValue() == 1) ? 0 : (numFequency.getValue()*(numFequency.getValue()-1))/2);
        }
        
        return totalPairs;
    }
}