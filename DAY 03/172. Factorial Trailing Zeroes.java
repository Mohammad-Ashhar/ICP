class Solution {
    public int trailingZeroes(int n) {
        if(n==0) return 0;
        return n/5 + trailingZeroes(n/5);

    }
}



    //     int fact=factorial(n);
    //     int c=0;
    //     while(fact%10==0)
    //     {
    //         c++;
    //         fact/=10;
    //     }
    //     return c;        
    // }
    // public int factorial(int n)
    // {
    //     if(n==0 || n==1) return 1;

    //     return n*factorial(n-1);

//     }
// }