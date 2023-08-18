class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length-1])
            return letters[0];
        int st = 0, end = letters.length-1;
        while(st <= end) {
            int mid = st+(end-st)/2;
            if(letters[mid] <= target) st = mid+1;
            else end = mid-1;
        }
        return letters[st];
    }
}