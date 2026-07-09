class Solution {
    public int[] constructRectangle(int area) {
        ArrayList<ArrayList<Integer>>arr=new ArrayList<>();
        for(int i=1;i*i<=area;i++){
            if(area%i==0){
                ArrayList<Integer>temp=new ArrayList<>();
                temp.add(i);
                temp.add(area/i);
                arr.add(temp);
            }
        }
        int[]res=new int[2];
        res[0]=arr.get(arr.size()-1).get(1);
        res[1]=arr.get(arr.size()-1).get(0);
        return res;
    }
}