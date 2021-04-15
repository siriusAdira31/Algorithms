
/*
1550. Three Consecutive Odds :: 
Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 
Example 1:

Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.
------------------------------------------
Example 2:

Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.

*/


class ThreeConsecutiveOdds {
	// method name as per leetcode.
    public boolean threeConsecutiveOdds(int[] arr) {
	  // case : array length less than 3 , then false.
      if(arr.length < 3)
          return false;
      else{
	      // loop till 3rd element from end of array.
          for(int index=0;index<=arr.length-3;index++){
                if(arr[index]%2==1 && arr[index+1]%2==1 && arr[index+2]%2==1)
                      return true;
          } 
      }   
      return false;
    }
}