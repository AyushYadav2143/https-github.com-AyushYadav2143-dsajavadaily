class Solution {
    public int addRungs(int[] rungs, int dist) {
        int addedRungs=0;
        int prevRungs=0;
        for(int i=0;i<rungs.length;i++){
            if((rungs[i]-prevRungs)>dist){
                addedRungs+=(rungs[i]-prevRungs-1)/dist;
            }
            prevRungs=rungs[i];
        }
        return addedRungs;

        
    }
}