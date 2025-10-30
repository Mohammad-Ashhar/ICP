import java.util.*;

public class VasyaAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
    

        char[] arr = s.toCharArray();
        int best = 0;

        for (char target = 'a'; target <= 'z'; target++) {
            int l = 0, r = 0;
            int countTarget = 0;
            while (r < n) {
                if (arr[r] == target) countTarget++;
                while ((r - l + 1) - countTarget > k) {
                    if (arr[l] == target) countTarget--;
                    l++;
                }
                best = Math.max(best, r - l + 1);
                r++;
            }
        }

        System.out.println(best);
    }
}
