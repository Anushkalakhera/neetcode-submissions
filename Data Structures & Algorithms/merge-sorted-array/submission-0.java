class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans=new int[m+n];
        for(int i=0;i<m;i++){
            ans[i]=nums1[i];
        }
        int k=0;
        for(int i=m;i<m+n;i++){
            ans[i]=nums2[k];
            k++;
        }
        Arrays.sort(ans);
        for(int i=0;i<ans.length;i++){
            nums1[i]=ans[i];
        }
    }
}