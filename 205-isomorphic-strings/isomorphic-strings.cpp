class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int f1[256] = {0}, f2[256] = {0};
        for(int i=0; i<s.size(); i++) {
            if(f1[s[i]] != f2[t[i]])
                return 0;
            f1[s[i]] = i+1;
            f2[t[i]] = i+1;
        }
        return 1;
    }
};