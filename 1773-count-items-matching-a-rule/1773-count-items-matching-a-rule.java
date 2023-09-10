class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int cnt = 0;
        for(List<String> list : items) {
            if(ruleKey.equals("type") && ruleValue.equals(list.get(0))) cnt++;
            if(ruleKey.equals("color") && ruleValue.equals(list.get(1))) cnt++;
            if(ruleKey.equals("name") && ruleValue.equals(list.get(2))) cnt++;
        }
        return cnt;
    }
}