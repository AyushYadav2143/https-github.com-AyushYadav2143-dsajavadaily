class Solution {
    public boolean detectCapitalUse(String word) {
        boolean res=false;
        if(word.equals(word.toUpperCase()))res=true;
        if(word.equals(word.toLowerCase()))res=true;
        if (Character.isUpperCase(word.charAt(0)) &&
            word.substring(1).equals(word.substring(1).toLowerCase()))
        res=true;
          
        return res;
        
    }
}