class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[][]dp=new int[n][n];
        for(int j=0;j<n;j++){
            dp[n-1][j]=matrix[n-1][j];
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n;j++){
                int minPath=dp[i+1][j];
                if(j>0){
                    minPath=Math.min(minPath,dp[i+1][j-1]);
                }
                if(j<n-1){
                    minPath=Math.min(minPath,dp[i+1][j+1]);
                }
                dp[i][j]=matrix[i][j]+minPath;
            }
        }
        int ans=dp[0][0];
        for(int j=1;j<n;j++){
            ans=Math.min(ans,dp[0][j]);
        }
        return ans;
        
    }
}