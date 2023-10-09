class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 0)
            return new int[]{-1, -1};
        
        int[] ans = new int[2];
        ans[0] = first_Occurence(nums, target);
        ans[1] = last_Occurence(nums, target);
        return ans;
    }
    public static int first_Occurence(int[] arr, int key) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int mid = (st + end) / 2;
            if (arr[mid] < key)
                st = mid + 1;
            else
                end = mid;
        }
        return (arr[st] == key) ? st : -1;
    }
    public static int last_Occurence(int[] arr, int key) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int mid = (st + end + 1) / 2;
            if (arr[mid] <= key)
                st = mid;
            else
                end = mid - 1;
        }
        return (arr[st] == key) ? st : -1;
    }
}