import java.util.*;
public class Nastya_And_Rice{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(n*(a+b)>=(c-d) && (c+d)>=n*(a-b)) sb.append("Yes\n");
            else sb.append("No\n");
        }
        System.out.println(sb.toString());
    }
}