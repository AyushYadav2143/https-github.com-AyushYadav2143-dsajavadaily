class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int sum=0;
            int num=i;
            while(num>0){
                int digit=num%10;
                sum+=digit;
                num/=10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int ans=0;
        for(int x:map.values()){
            ans=Math.max(ans,x);
        }
        return ans;
    }
}