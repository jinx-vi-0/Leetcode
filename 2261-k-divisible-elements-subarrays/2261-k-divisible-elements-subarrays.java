class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int n = nums.length;

        Set<ArrayList> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int divCnt = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = i; j < n; j++) {

                if (nums[j] % p == 0) divCnt++;
                if (divCnt <= k) {
                    list.add(nums[j]);
                    if (!set.contains(list)) {
                        set.add(new ArrayList<>(list));
                    }
                } else if (divCnt > k) break;
            }
        }
        return set.size();
    }
}