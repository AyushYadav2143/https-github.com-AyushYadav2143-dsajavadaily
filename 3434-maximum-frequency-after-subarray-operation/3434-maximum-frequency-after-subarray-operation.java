class Solution {
    public int maxFrequency(int[] nums, int k) {
        int orginalK=0;
        for(int num:nums){
            if(num==k){
                orginalK++;
            }
        }
        int maxGain=0;
        for(int value=1;value<=50;value++){
            if(value==k)continue;
            int currentGain=0;
            for(int num:nums){
                if(num==value)currentGain++;
                else if(num==k)currentGain--;
                currentGain=Math.max(currentGain,0);
                maxGain=Math.max(maxGain,currentGain);
            }

        }
        return orginalK+maxGain;
        
    }
}