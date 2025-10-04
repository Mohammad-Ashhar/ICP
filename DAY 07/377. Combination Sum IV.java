class Solution{
    public int combinationSum4(int[] nums,int target)
    {
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
        return dpComb(nums,target,dp);
    }
    public int dpComb(int[] nums,int target,int[] dp)
    {
        if(target==0) return 1;
        if(target<0) return 0;
        if(dp[target]!=-1) return dp[target];
        int c=0;
        for(int num:nums)
        {
            c+=dpComb(nums,target-num,dp);
        }
        return dp[target]=c;
    }
}






// class Solution {
//     public int combinationSum4(int[] nums, int target) {
//         return combination_sum4(nums,target);
//     }
//     public static int combination_sum4(int[] nums,int target)
//     {
//         if(target==0)
//         {
//             return 1;
//         }
//         if(target<0)
//         {
//             return 0;
//         }
//         int count=0;
//         for(int val:nums)
//         {
//             count+=combination_sum4(nums,target-val);
//         }
//         return count;
//     }
// }