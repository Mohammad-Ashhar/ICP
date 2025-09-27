class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=Integer.MAX_VALUE;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isPossible(piles,mid,h))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;        
    }
    public boolean isPossible(int[] piles,int mid,int h)
    {
        int hourCount=0;
        for(int p:piles)
        {
            hourCount+=p/mid+(p%mid==0?0:1);
        }
        return hourCount<=h?true:false;
    }
}