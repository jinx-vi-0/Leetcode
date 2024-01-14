class Solution {
public:
    bool closeStrings(string word1, string word2) {
        vector<int> f1(26,0), f2(26,0), w1(26,0), w2(26,0);

        for(char c : word1)
            f1[c-'a']++, w1[c-'a'] = 1;
        for(char c : word2)
            f2[c-'a']++, w2[c-'a'] = 1;

        sort(f1.begin(), f1.end());
        sort(f2.begin(), f2.end());

        return f1 == f2 && w1 == w2;
    }
};
