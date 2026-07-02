class Solution {
    public boolean isPrime(int n){
        if(n<=1)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;

    }
    public boolean checkPrimeFrequency(int[] nums) {
        int[]freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        boolean result=false;
        for(int i=0;i<freq.length &&result==false;i++){
            result=isPrime(freq[i]);

            

        }
        return result;
        

        
    }
}