class Solution {
public:
    int minOperations(vector<int>& nums, int k) {
        priority_queue<long long, vector<long long>, greater<long long>> pq;
        for(auto n : nums) pq.push(n);
        int op = 0;
        while(pq.size() && pq.top() < k) {
            long x = pq.top(); pq.pop();
            long y = pq.top(); pq.pop();

            pq.push(2*x + y);
            op++;
        }
        return op;
    }
};