class Solution {
    public int maxEqualFreq(int[] nums) {
        int[] freq = new int[100001];
        int[] count = new int[100001];

        int maxFreq = 0;
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            if (freq[x] > 0) {
                count[freq[x]]--;
            }

            freq[x]++;
            count[freq[x]]++;

            maxFreq = Math.max(maxFreq, freq[x]);

            int length = i + 1;
            int distinct = 0;

            for (int j = 1; j <= maxFreq; j++) {
                if (count[j] > 0) {
                    distinct++;
                }
            }

            if (maxFreq == 1) {
                answer = length;
            }
            else if (count[maxFreq] == 1 &&
                     count[maxFreq - 1] * (maxFreq - 1) +
                     maxFreq == length) {
                answer = length;
            }
            else if (count[1] == 1 &&
                     count[maxFreq] * maxFreq + 1 == length) {
                answer = length;
            }
        }

        return answer;
    }
}