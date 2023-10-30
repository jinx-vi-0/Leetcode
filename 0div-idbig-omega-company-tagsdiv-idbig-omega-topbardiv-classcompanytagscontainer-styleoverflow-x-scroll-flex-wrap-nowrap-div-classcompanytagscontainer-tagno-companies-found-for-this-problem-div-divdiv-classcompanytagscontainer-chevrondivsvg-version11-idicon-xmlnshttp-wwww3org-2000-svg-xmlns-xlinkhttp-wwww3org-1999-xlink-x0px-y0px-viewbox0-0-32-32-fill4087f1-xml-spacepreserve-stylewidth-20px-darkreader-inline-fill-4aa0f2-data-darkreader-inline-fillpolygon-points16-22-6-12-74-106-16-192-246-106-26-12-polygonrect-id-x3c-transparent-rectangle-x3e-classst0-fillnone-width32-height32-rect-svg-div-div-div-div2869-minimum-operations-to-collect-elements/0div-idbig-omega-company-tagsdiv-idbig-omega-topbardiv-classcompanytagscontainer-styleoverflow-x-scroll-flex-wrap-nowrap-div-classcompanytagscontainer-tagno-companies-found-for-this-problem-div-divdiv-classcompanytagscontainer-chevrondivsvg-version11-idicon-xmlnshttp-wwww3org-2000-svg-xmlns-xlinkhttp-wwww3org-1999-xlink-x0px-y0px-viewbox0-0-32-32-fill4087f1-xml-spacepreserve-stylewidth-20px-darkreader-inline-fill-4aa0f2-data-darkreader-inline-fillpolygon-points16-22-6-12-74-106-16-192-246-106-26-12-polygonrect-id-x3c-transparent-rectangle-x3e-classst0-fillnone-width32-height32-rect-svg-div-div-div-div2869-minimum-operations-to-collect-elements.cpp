class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        set<int> st;
        int n = nums.size(), cnt = 0;
        for(int i=n-1; i>=0; i--) {
            st.insert(nums[i]);
            cnt++;
            int f = 1;
            for(int i=1; i<=k; i++) {
                if(!st.count(i)) {
                    f = 0;
                    break;
                }
            }
            if(f) return cnt;
        }
        return cnt;
    }
};