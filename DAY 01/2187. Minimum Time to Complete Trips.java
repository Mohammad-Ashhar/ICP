class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low=1;
        int min=Integer.MAX_VALUE;
        for(int t:time) min=Math.min(t,min);
        long high=(long)min*totalTrips;
        long ans=0;
        while(low<=high)
        {
            long mid=low+(high-low)/2;
            if(isPossible(time,mid,totalTrips))
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
    public boolean isPossible(int[] time,long mid,long totalTrips)
    {
        long total=0;
        for(int t:time)
        {
            total+=mid/t;
            if(total>=totalTrips)
            {
                return true;
            }
        }
        return total>totalTrips;
    }
}