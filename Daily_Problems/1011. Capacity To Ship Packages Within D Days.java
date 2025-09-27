class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=0;
        for(int w:weights)
        {
            sum+=w;
            max=Math.max(max,w);
        }
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isPossible(weights,mid,days))
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
    public boolean isPossible(int[] weights,int mid,int days)
    {
        int wSum=0;
        int cut=0;
        for(int w:weights)
        {
            if(wSum+w>mid)
            {
                cut++;
                wSum=w;
            }
            else
            {
                wSum+=w;
            }
            if(cut>days) return false;
        }
        return cut<days;
    }
}