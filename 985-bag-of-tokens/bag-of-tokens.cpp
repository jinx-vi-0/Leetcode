class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        sort(tokens.begin(), tokens.end());
        int mx = 0, score = 0, i = 0, j = tokens.size()-1;
        while(i <= j) {
                if(power >= tokens[i]) {
                    power -= tokens[i++];
                    mx = max(mx, ++score);
                }
                else if(score) {
                    power += tokens[j--];
                    score--;
                }
                else break;
            }
        return mx;
    }
};