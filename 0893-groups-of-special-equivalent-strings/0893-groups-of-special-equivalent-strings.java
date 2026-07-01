class Solution {
    public String generateKey(String s){
        char[]even=new char[s.length()+1/2];
        char[]odd=new char[s.length()/2];
        int e=0;
        int o=0;
        for(int i=0;i<s.length();i++){
            if((i & 1)==0){
                even[e++]=s.charAt(i);
            }
            else{
                odd[o++]=s.charAt(i);
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        return new String(even)+"|"+new String(odd);

    }
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String>set=new HashSet<>();
        for(String s:words){
            set.add(generateKey(s));
        }
        return set.size();
       
        
    }
}