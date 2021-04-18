/*
1832. Check if the Sentence Is Pangram

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
-------------------
Example 2:

Input: sentence = "leetcode"
Output: false
*/


class PangramSentence {
    public boolean checkIfPangram(String sentence) {
        if(sentence == null || sentence.length()<26)
            return false;
        Set<Character> pangramSet = new TreeSet<Character>();
        
        for(int idx=0;idx<sentence.length();idx++){
            int asciiChar = sentence.charAt(idx);
            
            if(asciiChar>=97 && asciiChar<=122){
                pangramSet.add(sentence.charAt(idx));
            }
        }
        
        if(pangramSet.size() == 26)
            return true;
        
        return false;
    }
}