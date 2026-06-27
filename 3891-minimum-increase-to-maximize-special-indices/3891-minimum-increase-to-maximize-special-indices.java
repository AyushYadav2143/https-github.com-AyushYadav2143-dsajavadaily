class Solution {
    private long[][]dp;
    private int[]nums;
    private int n;
    public long minIncrease(int[] nums) {
        this.nums=nums;
        n=nums.length;
        dp=new long[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(1,(n&1)^1);

        
    }
    private long solve(int i,int skip){
        if(i>=n-1)return 0;
        if(dp[i][skip]!=-1)return dp[i][skip];
        long cost = Math.max(0L, (long)Math.max(nums[i - 1], nums[i + 1]) + 1 - nums[i]);
        long ans=cost+solve(i+2,skip);
        if(skip==1){
            ans=Math.min(ans,solve(i+1,0));

        }
        return dp[i][skip]=ans;
    }
}