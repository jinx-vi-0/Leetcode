class Solution {
public:
    int helper(vector<int>& nums, int key, int s, int e) {
        if(s>e) return -1;
        
        int mid = s + (e-s)/2;
        if(nums[mid] == key)
            return mid;
        
        if(nums[s] <= nums[mid]) {
            if(key >= nums[s] && key <= nums[mid])
                return helper(nums, key, s, mid-1);
            else
                return helper(nums, key, mid+1, e);
        }
        
        if(key >= nums[mid] && key <= nums[e])
            return helper(nums, key, mid+1, e);
        
        return helper(nums, key, s, mid-1);
    }
    int search(vector<int>& nums, int target) {
        return helper(nums, target, 0, nums.size()-1);
    }
};