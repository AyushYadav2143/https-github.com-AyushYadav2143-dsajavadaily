class Solution {
    int maxLength=0;
    private void backtrack(List<String>arr,int index,int mask,int len){
        maxLength=Math.max(maxLength,len);
        for(int i=index;i<arr.size();i++){
            String s=arr.get(i);
            int stringMask=0;
            boolean valid=true;
            for(char c:s.toCharArray()){
                int bit=1<<(c-'a');
                if((stringMask & bit)!=0){
                    valid=false;
                    break;
                }
                stringMask|=bit;
            }
            if(!valid)continue;
            if((mask & stringMask)!=0)continue;
            backtrack(arr,i+1,mask|stringMask,len+s.length());
        }
    }
    public int maxLength(List<String> arr) {
        backtrack(arr,0,0,0);
        return maxLength;
        
    }
}