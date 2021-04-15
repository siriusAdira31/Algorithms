/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i if non of the above conditions are true.
 
Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
-------------------------

Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
*/

class FizzBuzz {
	//method name kept same as required for leetcode Solution.
    public List<String> fizzBuzz(int lastNumber) {
        List<String> output = new ArrayList<String>();
        
        for(int current = 1;current<=lastNumber;current++){
            if((current%3==0)&&(current%5==0))
                output.add("FizzBuzz");
            else if(current%3==0)
                output.add("Fizz");
            else if(current%5==0)
                output.add("Buzz");
            else
                output.add(String.valueOf(current));
        }
        return output;
    }
}