class Solution {
    public long appealSum(String s) {
        int n = s.length();
        long sum=0;
        int[] f = new int[26];
        Arrays.fill(f, -1);
        for(int i=0; i<s.length(); i++) {
            int right = n-1-i;
            int left;
            
            int last = f[s.charAt(i)-'a'];
            if(last == -1) left = i;
            else left = (i-last)-1;
            sum += (left+1)*(right+1);
            f[s.charAt(i)-'a'] = i;
        }
        return sum;
    }
}