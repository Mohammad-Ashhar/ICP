public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<duo> pq = new PriorityQueue<>((a,b)-> Integer.compare(b.val,a.val));
        int[] ans = new int[nums.length-k+1];
        for(int i=0;i<k;i++){
            pq.add(new duo(nums[i],i));
        }
        ans[0]=pq.peek().val;
        int i=k;
        int start=0;
        int index=1;
        while(i<nums.length){
            pq.add(new duo(nums[i],i));
            while(!pq.isEmpty() && pq.peek().idx<=start){
                pq.poll();
            }
            ans[index++] = pq.peek().val;
            start++;
            i++;
        }
        return ans;
    }
    private class duo{
        int idx;
        int val;
        public duo(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
    }
}