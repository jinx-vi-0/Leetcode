class Solution {
public:
    bool isPalindrome(string s) {
        transform(s.begin(), s.end(), s.begin(), ::tolower); 
        cout << s << endl;
        string str;
        for(int i=0; i<s.size(); i++) {
            if(s[i] >= 'a' && s[i] <= 'z' || s[i] >= '0' && s[i] <= '9')
                str.push_back(s[i]);
        }

        int i=0, j=str.size()-1;
        while(i<j) {
            if(str[i] != str[j])
                return 0;
            i++, j--;
        }
        return 1;
    }
};