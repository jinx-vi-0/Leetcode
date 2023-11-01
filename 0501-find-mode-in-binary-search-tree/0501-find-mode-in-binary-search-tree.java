/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int mx = 1;
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        findMode(root, map);
        
        int[] ans = new int[map.size()];
        int idx = 0;
        for(Integer key : map.keySet()) {
            if(map.get(key) == mx)
                ans[idx++] = key;
        }
        return Arrays.copyOf(ans, idx);
    }
    public void findMode(TreeNode root, Map<Integer, Integer> map) {
        if(root == null)
            return;
        if(map.containsKey(root.val)) {
            int cnt = map.get(root.val) + 1;
            map.put(root.val, cnt);
            mx = Math.max(mx, cnt);
        }
        else map.put(root.val, 1);
        
        findMode(root.left, map);
        findMode(root.right, map);
    }
}