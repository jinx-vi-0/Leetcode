class Solution {
public:
    vector<int> distinctDifferenceArray(vector<int>& nums) {
        vector<int> ans;
        unordered_map<int,int> mp, rmp;
        for(auto a : nums) rmp[a]++;
        for(auto a : nums) {
            mp[a]++;
            rmp[a]--;
            if(rmp[a] == 0) rmp.erase(a);
            ans.push_back(mp.size() - rmp.size());
        }
        return ans;
    }
};