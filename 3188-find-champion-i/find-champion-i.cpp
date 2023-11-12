class Solution {
public:
    int findChampion(vector<vector<int>>& grid) {
        for(int i=0; i<grid.size(); i++) {
            bool ok = true;
            for(int j=0; j<grid.size(); j++) {
                if(i!=j && !grid[i][j])
                    ok = false;
            }
            if(ok)
                return i;
        }
        return -1;
    }
};