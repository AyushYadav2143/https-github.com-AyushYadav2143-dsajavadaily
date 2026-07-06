class Solution {
    static final long MOD=1000000007L;
    private void dfs(int node,long currentValue,ArrayList<ArrayList<Pair>>graph,int[]ans){
        ans[node]=(int)currentValue;
        for(Pair next:graph.get(node)){
            dfs(next.neighbour,(currentValue*next.weight)%MOD,graph,ans);
        }
    }
    
    static class Pair{
        int neighbour;
        int weight;
        Pair(int neighbour,int weight){
            this.neighbour=neighbour;
            this.weight=weight;
        }
    }
    public int[] baseUnitConversions(int[][] conversions) {
        int n=conversions.length+1;
        ArrayList<ArrayList<Pair>>graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[]edges:conversions){
            int from=edges[0];
            int to=edges[1];
            int factor=edges[2];
            graph.get(from).add(new Pair(to,factor));
        }
        int[] answer=new int[n];
        dfs(0,1L,graph,answer);
        return answer;

        
    }
}