class Solution {
public:
    bool makeEqual(vector<string>& words) {
        int n = words.size();
        unordered_map<char,int> mp;
        for(string s : words)
            for(char c : s)
                mp[c]++;
        
        for(auto i : mp)
            if(i.second % n)
                return false;

        return true;
    }
};