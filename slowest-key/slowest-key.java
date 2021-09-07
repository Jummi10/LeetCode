class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int first = 0, second = releaseTimes[0];
        int longestDuration = second, longestDurationIndex = 0;

        for (int i = 1; i < n; i++) {
            first = second;
            second = releaseTimes[i];

            int duration = second - first;
            if (duration == longestDuration) {
                int now = keysPressed.charAt(longestDurationIndex) - '0';
                int candidate = keysPressed.charAt(i) - '0';
                if (candidate > now) {
                    duration++;
                }
            }
            if (duration > longestDuration) {
                longestDuration = duration;
                longestDurationIndex = i;
            }
        }

        return keysPressed.charAt(longestDurationIndex);
    }
}