class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        printCombinations(n,k,ans,ll,1);
        return ans;
    }
    public static void printCombinations(int n,int k,List<List<Integer>> ans,List<Integer>ll,int idx)
    {
        if(ll.size()==k)
        {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<=n;i++)
        {
            ll.add(i);
            printCombinations(n,k,ans,ll,i+1);
            ll.remove(ll.size()-1);
        }
    }
}