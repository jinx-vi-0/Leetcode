class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i=0, n=nums.size();
        while(i < n) {
            while(i<n && nums[i]!=0) i++;
            int j=i+1;
            while(j<n && !nums[j]) j++;
            if(i<n && j<n) swap(nums[i], nums[j]);

            i++;
        }
    }
};