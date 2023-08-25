class Solution {
    public long appealSum(String s) {
        int n = s.length();
        long sum=0;
        int[] last = new int[26];
        for(int i=0; i<s.length(); i++) {
            last[s.charAt(i) - 'a'] = i + 1;
            for (int j: last)
                sum += j;
        }
        return sum;
    }
}