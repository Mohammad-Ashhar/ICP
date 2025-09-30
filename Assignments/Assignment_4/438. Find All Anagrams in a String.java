class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ll=new ArrayList<>();
        if(s.length()<p.length())
        {
            return ll;
        }
        int[] s1=new int[26];
        int[] s2=new int[26];
        for(char c:p.toCharArray())
        {
            s1[c-'a']++;
        }
        int m=p.length();
        for(int i=0;i<m;i++)
        {
            s2[s.charAt(i)-'a']++;
        }
        if(match(s1,s2))
        {
            ll.add(0);
        }
        for(int i=m;i<s.length();i++)
        {
            s2[s.charAt(i-m)-'a']--;
            s2[s.charAt(i)-'a']++;
            if(match(s1,s2))
            {
                ll.add(i-m+1);
            }
        }
        return ll;
    }
    public boolean match(int[] c1,int[] c2)
    {
        for(int i=0;i<26;i++)
        {
            if(c1[i]!=c2[i]) return false;
        }
        return true;
    }
}