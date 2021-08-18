class Solution {
    public int lengthOfLongestSubstring(String str) {
        int inputLength = str.length();
        List<Character> nonRepeatedChars = new ArrayList<>();
        int count = 0, longestLength = 0;

        for (int i = 0; i < inputLength; i++) {
            char c = str.charAt(i);
            if (nonRepeatedChars.contains(c)) {
                // remove all before c's location
                int loc = nonRepeatedChars.indexOf(c);
                if (loc >= 0) {
                    nonRepeatedChars.subList(0, loc + 1).clear();
                }

                // add c
                nonRepeatedChars.add(c);
                
                count = nonRepeatedChars.size();
                continue;
            }

            nonRepeatedChars.add(c);
            count++;
            if (count > longestLength) {
                longestLength = count;
            }
        }

        return longestLength;
    }
}