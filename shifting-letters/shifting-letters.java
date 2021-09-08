class Solution {
    private static final int ALPHABET_SIZE = 26;

    public String shiftingLetters(String str, int[] shifts) {
        int length = str.length();

        int[] shiftDp = new int[length + 1];
        shiftDp[length] = 0;
        for (int i = length - 1; i >= 0; i--) {
            shiftDp[i] = (shiftDp[i + 1] + shifts[i]) % ALPHABET_SIZE;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int ch = str.charAt(i) - 'a';
            ch = (ch + shiftDp[i]) % ALPHABET_SIZE;
            char shifted = (char)(ch + 97);
            sb.append(shifted);
        }

        return sb.toString();
    }
}