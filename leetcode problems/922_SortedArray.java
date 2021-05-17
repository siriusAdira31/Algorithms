/*
922. Sort Array By Parity II
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.

Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
_____________________
Example 2:
Input: nums = [2,3]
Output: [2,3]
___________________________
Constraints:
2 <= nums.length <= 2 * 104
nums.length is even.
Half of the integers in nums are even.
0 <= nums[i] <= 1000
*/


class SortedArray {
	/*
	Solution 1 : 
		- Use extra array od same size
		- loop 1 : store odd elements at odd Index of extra array
		- loop 2 : store even elements at even Index of extra array
		- loop 3 : copy all from extra array to input array
		- Time complexity : O(n+n+n) = O(3n) ~= O(n)  | space complexiry = O(n)
		
		
		
	Solution 2 : In place  ---> (Below function sortArrayByParityII())
		- Time complexiry = O(n) | auxiliary space complexity(1)  -> oddIndex,evenIndex,temp
	*/
	
    public int[] sortArrayByParityII(int[] arr) {
        int oddIdx = 1;
        int evenIdx = 0;
        
        while(evenIdx < arr.length-1 && oddIdx < arr.length){
            if(arr[evenIdx]%2 != 0 && arr[oddIdx]%2 != 1){
                int temp = arr[evenIdx];
                arr[evenIdx] = arr[oddIdx];
                arr[oddIdx] = temp;
                
                evenIdx+=2;
                oddIdx+=2;
            } else if(arr[evenIdx]%2 == 0 && arr[oddIdx]%2 != 1)
                evenIdx+=2;
            else if(arr[evenIdx]%2 != 0 && arr[oddIdx]%2 == 1)
                oddIdx+=2;
            else{
                evenIdx+=2;
                oddIdx+=2;
            }
            //System.out.println(Arrays.toString(arr));
        }
        
        return arr;
    }
}