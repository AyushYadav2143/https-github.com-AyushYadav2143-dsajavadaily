class Solution {
    public int maxDigitRange(int[] nums) {
        int maxDiff=-1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int maxDigit=0;
            int minDigit=9;
            while(num>0){
                int digit=num%10;
                maxDigit=Math.max(maxDigit,digit);
                minDigit=Math.min(minDigit,digit);
                num/=10;

            }
            int diff=maxDigit-minDigit;
            if(diff>maxDiff){
                maxDiff=diff;
                sum=nums[i];
            }
            else if(diff==maxDiff){
                sum+=nums[i];
            }
            
        }
        return sum;

        
    }
}