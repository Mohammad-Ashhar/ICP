class Solution
{
    public int[] rangedAddition(int n,int[][] queries)
    {
        int[] arr=new int[n];
        for(int[] q:queries)
        {
            arr[q[0]]+=q[2];
            if(q[1]+1<n) arr[q[1]+1]-=q[2];
        }
        for(int i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
        }
        return arr;
    }    
}