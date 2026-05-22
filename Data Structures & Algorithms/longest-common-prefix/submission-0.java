class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        String s=strs[0];
        String t=strs[n-1];
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(i)){
                res=res+s.charAt(i);
            }else{
                break;
            }
        }
        return res;
    }
}