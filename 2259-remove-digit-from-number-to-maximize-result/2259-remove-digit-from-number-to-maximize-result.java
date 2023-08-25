class Solution {
    public String removeDigit(String s, char digit) {
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == digit && s.charAt(i+1) > digit) {
                return s.substring(0, i) + s.substring(i+1, s.length());
            }
        }      
               
        int i = s.length()-1;
        while(i>=0 && s.charAt(i) != digit) {
            i--;
        }
        
        return s.substring(0, i) + s.substring(i+1, s.length());
    }
}