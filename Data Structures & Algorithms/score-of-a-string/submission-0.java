class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        int difference=0;
        for(int i=0;i<n-1;i++){
            difference=Math.abs(s.charAt(i+1)-s.charAt(i));
            sum=sum+difference;
        }
        return sum;
    }
}