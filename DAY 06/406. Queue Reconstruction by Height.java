class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]) return Integer.compare(a[1],b[1]);
            return Integer.compare(b[0],a[0]);
        });
        List<int[]>ll=new ArrayList<>();
        for(int[] per:people)
        {
            ll.add(per[1],per);
        }
        // int[][] res=new int[ll.size()][2];
        // for (int i=0;i<ll.size();i++) {
        //     int[] curr =ll.get(i);
        //     res[i][0]=curr[0];
        //     res[i][1]=curr[1];
        // }
        // return res;
        

        // Ye thoda fast h
        return ll.toArray(new int[people.length][]);
    }
}