class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        sort(tokens.begin(), tokens.end());
        int mx = 0, score = 0, i = 0, j = tokens.size()-1;
        while(i <= j) {
                if(power >= tokens[i]) {
                    power -= tokens[i];
                    score++;
                    i++;
                }
                else if(score) {
                    power += tokens[j];
                    score--;
                    j--;
                }
                else break;
                mx = max(mx,score);
            }
            mx = max(mx,score);
        return mx;
    }
};