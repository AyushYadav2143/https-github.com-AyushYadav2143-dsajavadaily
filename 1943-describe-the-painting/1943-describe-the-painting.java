class Solution {
    public List<List<Long>> splitPainting(int[][] segments) {
        TreeMap<Integer,Long>map=new TreeMap<>();
        for(int[]segment:segments){
            int start=segment[0];
            int end=segment[1];
            int color=segment[2];
            map.put(start,map.getOrDefault(start,0L)+color);
            map.put(end,map.getOrDefault(end,0L)-color);
        }
        List<List<Long>>ans=new ArrayList<>();
        long currentColor=0;
        int previousPoint=-1;
        for(Map.Entry<Integer,Long>entry:map.entrySet()){
            int currentPoint=entry.getKey();
            if(previousPoint!=-1 && currentColor!=0){
                List<Long>interval=new ArrayList<>();
                interval.add((long)previousPoint);
                interval.add((long)currentPoint);
                interval.add(currentColor);
                ans.add(interval);
            }
            currentColor+=entry.getValue();
            previousPoint=currentPoint;
        }
        return ans;
        
    }
}