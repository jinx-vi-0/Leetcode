class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        int[] count  = new int[1001];
        for (int[] num : nums)
            for (int i : num)
                count[i]++;
        
        for(int i=0; i<count.length; i++)
           if(count[i] == nums.length)
               list.add(i);
        
        return list;
    }
}