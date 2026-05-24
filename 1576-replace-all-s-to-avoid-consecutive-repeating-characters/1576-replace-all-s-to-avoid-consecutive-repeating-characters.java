class Solution {
    public String modifyString(String s) {
        char[]arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='?'){
                for(char c='a';c<='z';c++){
                    char prev=(i>0)?arr[i-1]:'#';
                    char next=(i<arr.length-1)?arr[i+1]:'#';
                    if(c!=prev && c!=next){
                        arr[i]=c;
                        break;
                    }
                }
            }
            
        }
        return new String(arr);
           
     
        
        
    }
}