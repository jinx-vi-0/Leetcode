class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        
        int i = 0, j = arr.length-1;
        while(i < j) {
            if(arr[i] < arr[i+1])
                i++;
            else if(arr[j] < arr[j-1])
                j--;
            else break;
        }
        return i != 0 && j != arr.length-1 && arr[i] == arr[j];
    }
}