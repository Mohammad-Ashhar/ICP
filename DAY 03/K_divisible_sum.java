import java.util.*;
public class K_divisible_sum{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            long n=sc.nextLong();
            long k=sc.nextLong();

            long m=((n+k-1)/k)*k;
            long ans=(m+n-1)/n;        
            sb.append(ans).append("\n");
        }
        System.out.println(sb.toString());
    }
}