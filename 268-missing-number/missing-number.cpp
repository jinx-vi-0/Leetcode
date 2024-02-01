class Solution {
public:
/*
    Use the fact that XOR is its own inverse
    Ex. [0,1,3,4]
    Missing = 4^(0^0)^(1^1)^(2^3)^(3^4)
            = (4^4)^(0^0)^(1^1)^(3^3)^2
            = 0^0^0^0^2 = 2
*/
    int missingNumber(vector<int>& nums) {
        int ans = nums.size();
        for(int i=0; i<nums.size(); i++)
            ans ^= i ^ nums[i];
        return ans;
    }
};