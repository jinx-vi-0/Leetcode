class Solution {
public:
    int sumOfEncryptedInt(vector<int>& nums) {
        int sum = 0;
        for(auto &num : nums) {
            int mx = 0, cnt = 0;
            while(num) {
                mx = max(mx, num % 10);
                num /= 10;
                cnt++;
            }
            
            int new_no = 0;
            while(cnt--) new_no = (new_no * 10) + mx;
            
            sum += new_no;
        }
        return sum;
    }
};