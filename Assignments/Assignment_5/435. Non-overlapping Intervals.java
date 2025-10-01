class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int min=intervals[0][1];
        int c=0;
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]<min)
            {
                c++;
            }
            else
            {
                min=intervals[i][1];
            }
        }
        return c;
        
    }
}