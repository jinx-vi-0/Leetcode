class Solution {
public:
    bool isPathCrossing(string path) {
        set<pair<int,int>> st;
        int x = 0, y = 0;
        st.insert({x,y});
        for(char c : path) {
            if(c == 'N') y++;
            else if(c == 'S') y--;
            else if(c == 'E') x++;
            else x--;

            if(st.find({x,y}) != st.end()) return true;
            else st.insert({x,y});
        }
        return false;
    }
};