class Solution {
    public int minOperations(String str) {
        int length = str.length();
        int odd = 0, even = 0;
        for (int i = 0; i <length; i++) {
            int x = str.charAt(i) - '0';
            if (i % 2 == 0 && x == 1) {
                even++;
            } else if (i % 2 == 1 && x == 0) {
                odd++;
            }
        }

        return Math.min(length - (odd + even), odd + even);
    }
}