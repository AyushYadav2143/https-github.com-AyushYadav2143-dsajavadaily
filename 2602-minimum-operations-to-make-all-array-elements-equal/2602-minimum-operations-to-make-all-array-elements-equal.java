class Solution {
    private int lowerBound(int[]nums,int q){
        int low=0;
        int high=nums.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]<q){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
    public List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n=nums.length;
        long[]prefix=new long[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
        List<Long>ans=new ArrayList<>();
        for(int q:queries){
            int idx=lowerBound(nums,q);
            long leftCost=(long)q*idx-prefix[idx];
            long rightCost=(prefix[n]-prefix[idx])-(long)q*(n-idx);
            ans.add(leftCost+rightCost);
        }
        return ans;
        
    }
}