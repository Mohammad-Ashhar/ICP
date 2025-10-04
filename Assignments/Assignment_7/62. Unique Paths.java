class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        return fun(m,n,dp);
    }
    public int fun(int row,int col,int[][] dp)
    {
        if(row==1||col==1) return 1;
        if(dp[row][col]!=-1) return dp[row][col];
        int down=fun(row-1,col,dp);
        int right=fun(row,col-1,dp);
        return dp[row][col]=down+right;
    }
}