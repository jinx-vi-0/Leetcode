class Solution {
public:
    int findLeastNumOfUniqueInts(vector<int>& arr, int k) {
        unordered_map<int, int> mp;
        for (int i : arr)
            mp[i]++;

        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
        
        for (auto &it : mp) {
            pq.push({it.second, it.first});
        }

        while (k > 0 && !pq.empty()) {
            auto curr = pq.top();
            pq.pop();
            
            if (curr.first <= k) {
                k -= curr.first;
            } else {
                curr.first -= k;
                pq.push(curr);
                k = 0;
            }
        }

        return pq.size();
    }
};
