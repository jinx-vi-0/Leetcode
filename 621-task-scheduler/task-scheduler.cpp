class Solution {
public:
    int leastInterval(vector<char>& tasks, int n) {
        vector<int> f(26,0);
        int mx = 0, mxCnt = 0;
        for(auto task : tasks) {
            f[task - 'A']++;
            if(mx == f[task - 'A'])
                mxCnt++;
            else if(mx < f[task - 'A']) {
                mx = f[task - 'A'];
                mxCnt = 1;
            }
        }

        int partCnt = mx - 1;
        int partLength = n - (mxCnt - 1);
        int emptySlots = partCnt * partLength;
        int availableTasks = tasks.size() - mx * mxCnt;
        int idles = max(0, emptySlots - availableTasks);

        return tasks.size() + idles;
    }
};