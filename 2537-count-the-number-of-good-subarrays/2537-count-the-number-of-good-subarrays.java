class Solution {
    public long countGood(int[] nums, int k) {
        long ans=0;
        long pair=0;
        int left=0;
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            int num=nums[right];
            pair+=freq.getOrDefault(num,0);
            freq.put(num,freq.getOrDefault(num,0)+1);
            while(pair>=k){
                ans+=nums.length-right;
                int remove=nums[left];
                pair-=freq.get(remove)-1;
                freq.put(remove,freq.get(remove)-1);
                left++;
            }
        }
        return ans;
        
    }
}