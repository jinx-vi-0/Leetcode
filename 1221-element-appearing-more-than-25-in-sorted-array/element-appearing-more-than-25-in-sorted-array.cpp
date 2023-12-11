class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        map<int,int> mp;
        for(int i : arr)
            mp[i]++;
        for(auto i : mp)
            if(i.second > arr.size()/4)
                return i.first;
        return -1;
    }
};