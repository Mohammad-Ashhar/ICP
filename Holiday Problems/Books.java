import java.util.*;
public class Books{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long t=sc.nextLong();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int l=0,ans=0;
        long sum=0;
        for(int r=0;r<n;r++){
            sum+=a[r];
            while(sum>t && l<=r) sum-=a[l++];
            ans=Math.max(ans, r-l+1);
        }
        System.out.println(ans);
    }
}
