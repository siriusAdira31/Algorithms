/*
1816. Truncate Sentence ::
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

Example 1:

Input: s = "Hello how are you Contestant", k = 4
Output: "Hello how are you"
Explanation:
The words in s are ["Hello", "how" "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".
-----------------------------------
Example 2:

Input: s = "chopper is not a tanuki", k = 5
Output: "chopper is not a tanuki"

*/



class TruncateSentence {
	// method name as per leetcode
    public String truncateSentence(String s, int k) {
      int spaceCount=0;  
      int spaceIndex=0;
      for(int charIndex=0;charIndex < s.length();charIndex++){
          if(s.charAt(charIndex) == ' ')
              spaceCount++;
		  // case : when string contains more than k word, space count equals (k)
          if((spaceCount == k)){ 
             spaceIndex=charIndex;
             break; 
          }
		  // case : when string contains exact k words , space count equals (k-1)
          if(spaceCount == (k-1) && charIndex == (s.length()-1)){ 
              spaceIndex=charIndex+1;
             break; 
          }
      }  
      return s.substring(0,spaceIndex);  
    }
}