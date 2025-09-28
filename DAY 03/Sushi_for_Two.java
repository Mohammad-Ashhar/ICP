import java.util.*;
public class Sushi_for_Two{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        List<Integer>ll=new ArrayList<>();
        int c=1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1]) c++;
            else {
                ll.add(c);
                c=1;
        }
        }
        ll.add(c);
        int ans=0;
        for(int i=0;i<ll.size()-1;i++)
        {
            ans=Math.max(ans,2*Math.min(ll.get(i),ll.get(i+1)));
        }
        System.out.println(ans);
    }
}
