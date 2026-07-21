class Solution {
    public String convertDateToBinary(String date) {
        String ans="";
        StringBuilder temp=new StringBuilder();
        for(char ch:date.toCharArray()){
           
            if(ch=='-'){
                String binary=Integer.toBinaryString(Integer.parseInt(temp.toString()));
                
                ans+=binary+"-";
                temp.setLength(0);
            }
            else{
                temp.append(ch);
            }
        }
        if(temp.length()>0){
            String binary=Integer.toBinaryString(Integer.parseInt(temp.toString()));
            
            ans+=binary;

        }
        return ans;
        
    }
}