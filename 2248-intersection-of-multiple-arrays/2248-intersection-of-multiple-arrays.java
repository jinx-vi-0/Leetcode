class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] num : nums) {
            for (int i : num) {
                map.put(i, map.getOrDefault(i, 0) + 1);
                if (map.get(i) == nums.length)
                    list.add(i);            
            }
        }
        Collections.sort(list);
        return list;
    }
}