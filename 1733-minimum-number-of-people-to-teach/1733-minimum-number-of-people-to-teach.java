class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m=languages.length;
        List<Set<Integer>> known=new ArrayList<>();
        for(int[]lang:languages){
            Set<Integer>set=new HashSet<>();
            for(int l:lang){
                set.add(l);
            }
            known.add(set);
        }
        Set<Integer>badUsers=new HashSet<>();
        for(int[]friendship:friendships){
            int u=friendship[0]-1;
            int v=friendship[1]-1;
            boolean canCommunicate=false;
            for(int lang:known.get(u)){
                if(known.get(v).contains(lang)){
                    canCommunicate=true;
                    break;
                }
            }
            if(!canCommunicate){
                badUsers.add(u);
                badUsers.add(v);
            }
        }
        if(badUsers.isEmpty())return 0;
        int answer=Integer.MAX_VALUE;
        for(int lang=1;lang<=n;lang++){
            int teachCount=0;
            for(int user:badUsers){
                if(!known.get(user).contains(lang)){
                    teachCount++;
                }
            }
            answer=Math.min(answer,teachCount);
        }
        return answer;


    }
}