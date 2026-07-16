class Solution {
    public int numberOfSteps(int num) {
        int steps=0;
        while(num>0){
            if((num & 1 )==0){
                num/=2;
                steps++;
                System.out.println(num);
            }
            else{
                num-=1;
                System.out.println(num);
                steps++;
            }
        }
        return steps;
    }
}