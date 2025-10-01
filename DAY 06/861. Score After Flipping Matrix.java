class Solution {
public int matrixScore(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        for (int i=0;i<m;i++) {
            if (grid[i][0] == 0) {
            for(int j=0;j<n;j++) grid[i][j]=grid[i][j]==1?0:1;
            }
        }
        for(int j=1;j<n;j++) {
            int ones=0;
            for(int i=0;i<m;i++) 
                if(grid[i][j]==1) ones++;
        if (ones*2<m) {
            for (int i=0;i<m;i++) grid[i][j]=grid[i][j]==1?0:1;
        }
        }
        int score=0;
        for(int i=0;i<m;i++) {
        int val=0;
        for(int j=0;j<n;j++) val=val*2+grid[i][j];
            score+=val;
        }
        return score;
        }
        }