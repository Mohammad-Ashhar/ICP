class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length;
        long[] pretotalSum=new long[n];
        long sum=0L;
        for(int i=0;i<n;i++)
            {
                sum+=nums[i];
                pretotalSum[i]=sum;
            }
        boolean[] inc=new boolean[n];
        inc[0]=true;
        for(int i=1;i<n;i++)
            {
                inc[i]=inc[i-1] && (nums[i]>nums[i-1]);
            }
        boolean[] dec=new boolean[n];
        dec[n-1]=true;
        for(int i=n-2;i>=0;i--)
            {
                dec[i]=dec[i+1] && (nums[i]>nums[i+1]);
            }
        long ans=Long.MAX_VALUE;
        for(int i=0;i<n-1;i++)
            {
                if(inc[i] && dec[i+1])
                {
                    long left=pretotalSum[i];
                    long right=sum-left;
                    long d=left-right;
                    if(d<0) d=-d;
                    if(d<ans) ans=d;
                }
            }
        return ans==Long.MAX_VALUE?-1L:ans;
        
    }
}