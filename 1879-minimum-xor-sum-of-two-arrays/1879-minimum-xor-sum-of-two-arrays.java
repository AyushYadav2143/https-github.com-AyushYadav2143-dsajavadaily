class Solution {
    int[]nums1,nums2;
    Integer[]memo;
    private int dfs(int mask){
        if(memo[mask]!=null)return memo[mask];
        int n=nums1.length;
        int i=Integer.bitCount(mask);
        if(i==n)return 0;
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            if((mask &(1<<j))==0){
                int cost=nums1[i]^nums2[j];
                int newMask=mask|(1<<j);
                ans=Math.min(ans,cost+dfs(newMask));
            }
        }
        memo[mask]=ans;
        return ans;
    }
    
    public int minimumXORSum(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        int n=nums1.length;
        memo=new Integer[1<<n];
        return dfs(0);
        
    }
}