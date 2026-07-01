class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        arr.sort((a,b)->String.valueOf(a).compareTo(String.valueOf(b)));
        return arr;


    }
        
    
}