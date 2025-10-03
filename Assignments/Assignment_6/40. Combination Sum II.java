class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>ll=new ArrayList<>();
        Arrays.sort(candidates);
        printSum(candidates,0,ll,ans,target);
        return ans;   
    }
    public static void printSum(int[] candidates,int idx,List<Integer>ll,List<List<Integer>>ans,int target)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<candidates.length;i++)
        {
            if(i>idx && candidates[i]==candidates[i-1])
            {
                continue;
            }
            if(candidates[i]>target)
            {
                break;
            }
            ll.add(candidates[i]);
            printSum(candidates,i+1,ll,ans,target-candidates[i]);
            ll.remove(ll.size()-1);
        }
    }
}