class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        int[] lhp=new int[n];
        int pre=0,suf=1;
        while(suf<n)
        {
            if(s.charAt(pre)==s.charAt(suf))
            {
                lhp[suf]=pre+1;
                pre++;
                suf++;
            }
            else{
                if(pre==0)
                {
                    lhp[suf]=0;
                    suf++;
                }
                else{
                    pre=lhp[pre-1];
                }
            }
        }
        return s.substring(0,lhp[n-1]);
        
        
    }
}