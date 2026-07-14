class Solution {
    public int numberOfPairs(int[][] points) {
        int res=0;
        for(int i=0;i<points.length;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            for(int j=0;j<points.length;j++){
                if(i==j)continue;
                int x2=points[j][0];
                int y2=points[j][1];
                if(x1>x2 || y1<y2)continue;
                boolean valid=true;
                for(int k=0;k<points.length;k++){
                    if(k==i || k==j)continue;
                    int x=points[k][0];
                    int y=points[k][1];
                    if(x>=x1 && x<=x2 && y>=y2 && y<=y1){
                    valid=false;
                    break;
                    }
                }
                if(valid)res++;

            }
        }
        return res;
        
    }
}