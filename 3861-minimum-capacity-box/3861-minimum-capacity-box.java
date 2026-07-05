class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans=-1;
        int minDifference=Integer.MAX_VALUE;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                int diff=Math.abs(capacity[i]-itemSize);
                if(diff<minDifference){
                    minDifference=diff;
                    ans=i;
                }

            }
        }
        return ans;
        
    }
}