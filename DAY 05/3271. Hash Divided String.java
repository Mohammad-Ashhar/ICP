class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int size=0;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(size==k)
            {
                sb.append((char)(sum%26 + 97));
                sum=0;
                size=0;
            }
            sum+=s.charAt(i)-'a';
            size++;

        }
        sb.append((char)(sum%26 + 97));
        return sb.toString();          
        
        
    }
}