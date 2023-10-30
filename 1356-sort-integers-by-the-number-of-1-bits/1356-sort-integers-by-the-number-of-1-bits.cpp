class Solution {
public:
    vector<int> sortByBits(vector<int>& arr) {
        vector<pair<int,int>> a;
        for(int i=0; i<arr.size(); i++)
            a.push_back(make_pair(arr[i], __builtin_popcount(arr[i])));
        
        sort(a.begin(), a.end(), [](auto &p1, auto &p2) {
            if(p1.second == p2.second) {
                return p1.first < p2.first;
            }
            return p1.second < p2.second;
        });
        
        vector<int> ans;
        for(auto it : a) {
            ans.push_back(it.first);
        }
        return ans;
    }
};