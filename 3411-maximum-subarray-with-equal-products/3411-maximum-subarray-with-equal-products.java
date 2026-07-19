class Solution {
    private int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    private int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
    public int maxLength(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int prod=1;
            int lcm=1;
            int gcd=0;
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                if(gcd==0){
                    gcd=nums[j];
                }
                else{
                    gcd=gcd(gcd,nums[j]);
                }
                lcm=lcm(lcm,nums[j]);
                if(prod==(lcm*gcd)){
                    ans=Math.max(ans,j-i+1);
                }

            }
        }
        return ans;
        
    }
}