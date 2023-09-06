class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for(int candy : candies) {
            max = Math.max(max, candy);
        }
        max = max - extraCandies;
        for(int i : candies)
            result.add(i >= max);

        return result;
    }
}