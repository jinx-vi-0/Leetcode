class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        int[] count  = new int[1001];
        for (int[] num : nums) {
            for (int i : num) {
                count[i]++;
                if (count[i] == nums.length)
                    list.add(i);            
            }
        }
        Collections.sort(list);
        return list;
    }
}