/*
1078. Occurrences After Bigram

Given words first and second, consider occurrences in some text of the form "first second third", where second comes immediately after first, and third comes immediately after second.

For each such occurrence, add "third" to the answer, and return the answer.
-------------------
Example 1:

Input: text = "alice is a good girl she is a good student", first = "a", second = "good"
Output: ["girl","student"]

-------------------------------
Example 2:

Input: text = "we will we will rock you", first = "we", second = "will"
Output: ["we","rock"]
*/


class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> occurences = new ArrayList<String>();
        for(int position=0;position<words.length-2;position++){
            if(words[position].equals(first) && words[position+1].equals(second))
                occurences.add(words[position+2]);
        }
        return occurences.toArray(new String[occurences.size()]);
    }
}