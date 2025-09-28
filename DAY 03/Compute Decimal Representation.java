class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer>ll=new ArrayList<>();
        int pow10=1;
        while(n>0)
            {
                int d=n%10;
                if(d!=0)
                {
                    ll.add(d*pow10);
                }
                n/=10;
                pow10*=10;
            }
        Collections.sort(ll,Collections.reverseOrder());
        int l=ll.size();
        int[] arr=new int[l];
        for(int i=0;i<l;i++)
            {
                arr[i]=ll.get(i);
            }
        return arr;
        
        
        
        
    }
}