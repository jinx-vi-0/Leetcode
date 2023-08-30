class Solution {
    public double average(int[] salary) {
        int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    
        for (var v : salary) {
            sum += v;
            min = Math.min(min, v);
            max = Math.max(max, v);
        }
        return (double)(sum-min-max)/(salary.length-2);
    }
}