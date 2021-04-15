/*
You are given a sorted unique integer array nums.

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 
---------------------------
Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
---------------------------
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
---------------------------
Example 3:

Input: nums = []
Output: []
---------------------------
Example 4:

Input: nums = [-1]
Output: ["-1"]
---------------------------
Example 5:

Input: nums = [0]
Output: ["0"]
*/



class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> sortedIndexes = new ArrayList<String>();
        
       if(nums.length == 0)
            return sortedIndexes;
        else if(nums.length == 1){
            sortedIndexes.add(String.valueOf(nums[0]));
            return sortedIndexes;
        } else{
            String sortedList="";
            for(int i=0;i<nums.length-1;){
				// case : when nums[i] & nums[i+1] are equal
               if(nums[i] == nums[i+1]){
                   sortedIndexes.add(String.valueOf(nums[i]));
                   i = i+2;
               }else if((nums[i+1] - nums[i]) == 1){ // case : when nums[i] & nums[i+1] have difference equals 1
                   String lastElement = String.valueOf(nums[i+1]);
				   //case : adding initial range start->end 
                   if(sortedList.length() == 0){
                      sortedList = nums[i]+"->"+lastElement; 
                      sortedIndexes.add(sortedList); 
                   }else if(sortedList.length() > 0){ //case : updating last element in range start->end 
                	   String[] sortedRange = sortedList.split("->");
                       sortedList = sortedRange[0]+"->"+lastElement;
                       sortedIndexes.remove(sortedIndexes.size()-1);
                       sortedIndexes.add(sortedList); 
                   }
                   i = i+1;
               }else if((nums[i+1] - nums[i]) != 1) { // case : when nums[i] & nums[i+1] have difference not equals 1
            	   /* case : add the current element only when :
					           1) first element of array : arr[0]
						   OR  2) not equal to last element from output_range_list(sortedIndexes) : as it will be added in previous loop
				   */
				   if(i==0 || (i!=0 && (nums[i] - nums[i-1]) != 1 && Integer.valueOf(sortedIndexes.get(sortedIndexes.size()-1)) != nums[i]))
            		   sortedIndexes.add(String.valueOf(nums[i]));
            	   sortedList = String.valueOf(nums[i+1]);
                   sortedIndexes.add(sortedList);
                   i =i+1;
               }   
            }
        }
         return sortedIndexes;
    }
}