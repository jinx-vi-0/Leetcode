class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int maxi = 0;
        for(int value : map.values())
            maxi = Math.max(maxi, value);
        
        int ans = 0;
        for(int value : map.values()) {
            if(value == maxi)
                ans += value;
        }

        return ans;
    }
}