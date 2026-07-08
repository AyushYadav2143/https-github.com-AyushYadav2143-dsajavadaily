class Solution {
    public int minSteps(String s, String t) {
        int res=0;
        int[]freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch:t.toCharArray()){
            freq[ch-'a']--;
        }
        for(int x:freq){
            res+=Math.abs(x);
        }
        return res;
        
    }
}