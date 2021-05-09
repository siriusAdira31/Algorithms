
/*
1704. Determine if String Halves Are Alike

- You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
- Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
- Return true if a and b are alike. Otherwise, return false.

Example 1:
Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
_______________________________________
Example 2:
Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
_______________________________________
Example 3:
Input: s = "MerryChristmas"
Output: false
_______________________________________
Example 4:
Input: s = "AbCdEfGh"
Output: true
*/

class AlikeString {
    public boolean halvesAreAlike(String s) {
        int vowelCount1=0,vowelCount2=0;
        int idx1=0,idx2=s.length()/2;
        
        for(;idx1<s.length()/2;){
            char char1 = s.charAt(idx1), char2 = s.charAt(idx2);
            if((char1 == 'a' || char1 == 'A') || (char1 == 'e'  || char1 == 'E') || (char1 == 'i'  || char1 == 'I') || (char1 == 'o'  || char1 == 'O') || (char1 == 'u' || char1 == 'U'))
                vowelCount1++;
            
            if((char2 == 'a' || char2 == 'A') || (char2 == 'e'  || char2 == 'E') || (char2 == 'i'  || char2 == 'I') ||(char2 == 'o'  || char2 == 'O') || (char2 == 'u' || char2 == 'U'))  
                vowelCount2++;
            
            idx1++;
            idx2++;
        }
        
        return (vowelCount1 == vowelCount2) ? true : false;
    }
}