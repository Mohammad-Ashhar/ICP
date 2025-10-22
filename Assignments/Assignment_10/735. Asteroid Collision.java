class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int ast:asteroids)
        {
            boolean explode=false;
            while(!st.isEmpty() && ast<0 && st.peek()>0)
            {
                if(st.peek()<-ast)
                {
                    st.pop();
                    continue;
                }
                else if(st.peek()==-ast) st.pop();
                explode=true;
                break;
            }
            if(!explode) st.push(ast);
        }
        int[] ans=new int[st.size()];
        for(int i=st.size()-1;i>-1;i--)
        {
            ans[i]=st.pop();
        }
        return ans;
    }
}