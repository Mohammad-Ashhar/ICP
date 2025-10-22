class Solution {
    public String removeDuplicates(String s, int k) {
        StringBuilder sb=new StringBuilder(s);
        int[] freq=new int[s.length()];
        for(int i=0;i<sb.length();i++)
        {
            if(i>0 && sb.charAt(i)==sb.charAt(i-1)) freq[i]=freq[i-1]+1;
            else freq[i]=1;
            if(freq[i]==k)
            {
                sb.delete(i-k+1,i+1);
                i=i-k;
            }
        }
        return sb.toString();
        
    }
}