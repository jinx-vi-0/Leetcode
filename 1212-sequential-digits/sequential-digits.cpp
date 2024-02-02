class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        string s = "123456789";
        vector<int> ans;
        for(int i=0; i<s.size(); i++) {
            for(int j=i+1; j<=s.size(); j++) {
                int curr = stoi(s.substr(i, j-i));
                if(curr >= low && curr <= high)
                    ans.push_back(curr);
            }
        }
        sort(ans.begin(), ans.end());
        return ans;
    }
};