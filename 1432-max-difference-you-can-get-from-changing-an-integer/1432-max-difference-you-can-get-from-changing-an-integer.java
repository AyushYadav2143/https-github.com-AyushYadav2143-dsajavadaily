class Solution {
    public int maxDiff(int num) {
        String s=String.valueOf(num);
        char replaceMax=' ';
        for(char c:s.toCharArray()){
            if(c!='9'){
                replaceMax=c;
                break;
            }
        }
        String max=s;
        if(replaceMax!=' '){
            max=s.replace(replaceMax,'9');
        }
        char replaceMin=' ';
        String min=s;
        if(s.charAt(0)!='1'){
            replaceMin=s.charAt(0);
            min=s.replace(replaceMin,'1');
        }
        else{
            for(int i=1;i<s.length();i++){
                if(s.charAt(i)!='0'&& s.charAt(i)!='1'){
                    replaceMin=s.charAt(i);
                    break;
                }
            }
            if(replaceMin!=' '){
                min=s.replace(replaceMin,'0');
            }
        }
        return Integer.parseInt(max)-Integer.parseInt(min);
        
    }
}