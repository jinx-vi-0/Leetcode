class Solution {
public:
    long long largestPerimeter(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        vector<long long> pre(n);
        pre[0] = nums[0];
        for(int i=1; i<n; i++)
            pre[i] = pre[i-1] + nums[i];
        
        for(int i=n-2; i>0; i--) {
            if(i<1) break;
            if(pre[i] > nums[i+1])
                return pre[i+1];
        }
        return -1;
    }
};