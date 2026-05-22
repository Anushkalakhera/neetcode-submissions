class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int c1=0;
        int c2=0;
        int c0=0;
        int[] res=new int[n];
        if(nums.length==1) res[0]=nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]==0) c0++;
            if(nums[i]==1) c1++;
            if(nums[i]==2) c2++;
        }

        for(int i=c0;i<c0+c1;i++){
            res[i]=1;
        }
        for(int i=c0+c1;i<n;i++){
            res[i]=2;
        }

        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    }
}