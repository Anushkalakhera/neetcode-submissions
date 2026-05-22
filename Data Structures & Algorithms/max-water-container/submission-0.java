class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int max=Integer.MIN_VALUE;
        int vol=0;
        while(l<r){
            if(height[l]<height[r]){
                vol=height[l]*(r-l);
                l++;
            }else if(height[l]>height[r]){
                vol=height[r]*(r-l);
                r--;
            }else{
                vol=height[r]*(r-l);
                l++;
                r--;
            }
            max=Math.max(vol,max);
        }
        return max;
    }
}