class Solution {
public:
    long long maximumTripletValue(vector<int>& nums) {
        int n = nums.size();
        long long mx = INT_MIN;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                for(int k=j+1; k<n; k++) {
                    long long sum = (nums[i]-nums[j]);
                    mx = max(mx, sum*nums[k]);
                }
            }
        }
        return mx > 0 ? mx : 0; 
    }
};