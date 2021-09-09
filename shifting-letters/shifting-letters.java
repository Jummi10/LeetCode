class Solution {
    private static final int ALPHABET_SIZE = 26;

    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        for (int i = n-2; i >= 0; i--)
            shifts[i] += shifts[i+1]%26;
        
        char[] ret = new char[n];
        for (int i = 0; i < n; i++)
            ret[i] = (char) ((s.charAt(i)-'a'+shifts[i])%26+'a');
        
        return new String(ret);
    }
}