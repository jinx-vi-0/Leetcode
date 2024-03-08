class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int freq[101] = {0}, maxF = 0;
        for(int num : nums) {
            freq[num]++;
            maxF = max(maxF, freq[num]);
        }

        int ans = 0;
        for(int f : freq)
            if(f == maxF)
                ans += f;

        return ans;
    }
};