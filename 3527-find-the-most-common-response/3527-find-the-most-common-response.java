class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        List<List<String>> dub=new ArrayList<>();
        for(int i=0;i<responses.size();i++){
            Set<String>set=new LinkedHashSet<>(responses.get(i));
            List<String>result=new ArrayList<>(set);
            dub.add(result);
        }
        Map<String,Integer>freq=new HashMap<>();
        for(List<String>list:dub){
            for(String s:list){
                freq.put(s,freq.getOrDefault(s,0)+1);
            }
        }
        List<String>result=new ArrayList<>();
        int maxFreq=0;
        for(Map.Entry<String,Integer>entry:freq.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq=entry.getValue();
                result.clear();
                result.add(entry.getKey());
            }
            else if(entry.getValue()==maxFreq){
                result.add(entry.getKey());
            }
        }
       // System.out.println(maxFreq);
        //System.out.println(result);
        //return "abc";
        String ans="";
        
        if(result.size()==1)ans=result.get(0);
        else{
            String min=Collections.min(result);
            ans=min;
        }
        return ans;
        

        
    }
}