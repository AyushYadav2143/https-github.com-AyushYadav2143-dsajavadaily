class Solution {
    public String[] shortestSubstrings(String[] arr) {
        int n=arr.length;
        String[]ans= new String[n];
        for(int i=0;i<n;i++){
            String best="";
            for(int start=0;start<arr[i].length();start++){
                for(int end=start+1;end<=arr[i].length();end++){
                    String sub=arr[i].substring(start,end);
                    boolean foundInOther=false;
                    for(int j=0;j<n;j++){
                        if(i==j)continue;
                        if(arr[j].contains(sub)){
                            foundInOther=true;
                            break;
                        }
                    }
                    if(!foundInOther){
                        if(best.equals(""))best=sub;
                        else if(sub.length()<best.length())best=sub;
                        else if(sub.length()==best.length()&& sub.compareTo(best)<0)best=sub;
                    }
                }
            }
            ans[i]=best;
        }
        return ans;
        
        
    }
}