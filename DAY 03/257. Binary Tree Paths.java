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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>ll=new ArrayList<>();
        if(root==null) return ll;
        Paths(root,"",ll);
        return ll;
    }
    public void Paths(TreeNode node,String path,List<String>ll)
    {
        if(node==null) return;
        if(path.isEmpty()) path=Integer.toString(node.val);
        else path+="->"+node.val;
        if(node.left==null && node.right==null) 
        {
            ll.add(path);
            return;
        }
        Paths(node.left,path,ll);
        Paths(node.right,path,ll);

    }
}