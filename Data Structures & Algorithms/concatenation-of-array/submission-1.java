class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2*n];
        int nn=arr.length;
        for(int i=0;i<nn/2;i++){
            arr[i]=nums[i];
        }
        int j=0;
        for(int i=nn/2;i<nn;i++){
            arr[i]=nums[j];
            j++;
        }
        return arr;
    }
}