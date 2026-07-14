class Solution {
    public String maximumXor(String s, String t) {
        int[]freq=new int[2];
        for(char ch:t.toCharArray()){
            freq[ch-'0']++;
        }
        String res="";
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch=='0'){
                if(freq[1]>0){
                    str.append('1');
                    freq[1]--;
                }
                else{
                    str.append('0');
                    freq[0]--;
                }
            }
            else{
                if(freq[0]>0){
                    str.append('0');
                    freq[0]--;
                }
                else{
                    str.append('1');
                    freq[1]--;
                }
            }
        }
        StringBuilder xor=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==str.charAt(i))xor.append('0');
            else xor.append('1');
        }
        return xor.toString();

        
    }
}