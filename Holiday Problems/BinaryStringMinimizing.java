import java.util.*;
public class BinaryStringMinimizing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            long k=sc.nextLong();
            String s=sc.next(); 
            char[] ans=new char[n];
            Arrays.fill(ans, '1');

            int cur=0; 
            for (int i=0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    long canMove=Math.min(k, (long)(i - cur));
                    int pos=(int)(i - canMove);
                    ans[pos]='0';
                    k -= canMove;
                    cur++; 
                }
            }

            sb.append(new String(ans)).append('\n');
        }
        System.out.print(sb.toString());
    
    }
}
