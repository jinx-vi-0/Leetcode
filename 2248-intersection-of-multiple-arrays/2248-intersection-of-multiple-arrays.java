class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int num = nums[i][j];
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        
        for (Integer key : map.keySet()) {
            if (map.get(key) == nums.length) {
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
    }
}