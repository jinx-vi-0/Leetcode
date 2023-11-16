class Solution {
public:
    string findDifferentBinaryString(vector<string>& nums) {
        unordered_set<int> st;
        for(auto a : nums)
            st.insert(stoi(a, nullptr, 2));
        for(int i=0; ; i++)
            if(!st.count(i))
                return bitset<16>(i).to_string().substr(16-nums.size());
        return "";
    }
};