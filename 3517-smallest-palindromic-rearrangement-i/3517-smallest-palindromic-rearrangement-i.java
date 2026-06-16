class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        char[]arr=new char[n];
        char[]half=s.substring(0,n/2).toCharArray();
        Arrays.sort(half);
        for(int i=0;i<half.length;i++){
            arr[i]=half[i];
            arr[n-1-i]=half[i];
        }
        if(n%2==1){
            arr[n/2]=s.charAt(n/2);

        }
        return new String(arr);
        
    }
}