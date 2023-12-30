class Solution {
public:
    bool makeEqual(vector<string>& words) {
        int f[26] = {0};
        for(string s : words)
            for(char c : s)
                f[c - 'a']++;
        
        for(auto i : f)
            if(i % words.size() != 0)
                return false;

        return true;
    }
};