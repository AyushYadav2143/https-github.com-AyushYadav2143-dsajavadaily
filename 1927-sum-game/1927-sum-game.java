class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        int leftSum=0;
        int rightSum=0;
        int leftQ=0;
        int rightQ=0;
        for(int i=0;i<n;i++){
            if(i<n/2){
                if(num.charAt(i)=='?'){
                    leftQ++;
                }
                else{
                    leftSum+=num.charAt(i)-'0';
                }
            }
            else{
                if(num.charAt(i)=='?'){
                    rightQ++;
                }
                else{
                    rightSum+=num.charAt(i)-'0';
                }
            }

        }
        if(leftQ==rightQ){
            return leftSum!=rightSum;
        }
        int diff=leftSum-rightSum;
        int qDiff=leftQ-rightQ;
        return diff*2!=-9*qDiff;
        
    }
}