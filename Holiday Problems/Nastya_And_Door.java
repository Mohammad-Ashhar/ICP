import java.util.*;
public class Nastya_And_Door{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int[] peak=new int[n];
            for(int i=1;i<n-1;i++) 
            {
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) peak[i]=1;
            }
            int[] prefix=new int[n];
            for(int i=1;i<n;i++) prefix[i]=prefix[i-1]+peak[i];
            int ansIdx=0,ans=0;
            
            for(int i=0;i+k<=n;i++)
            {
                int peaks=prefix[i+k-2]-prefix[i];
                if(peaks>ans)
                {
                    ans=peaks;
                    ansIdx=i;
                }
            }
            sb.append(ans+1).append(" ").append(ansIdx+1).append("\n");
        }
        System.out.println(sb.toString());
    }
}